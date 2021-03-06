package com.hitices.common.base.model;

import com.hitices.common.base.MUniqueObjectManager;
import com.hitices.common.service.MSvcInstance;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;

@ToString
public class MSvcInstManager extends MUniqueObjectManager<MSvcInstance> {


    public Optional<MSvcInstance> getByIp(String ip) {
        for (MSvcInstance instance : this.objectMap.values()) {
            if (instance.getIp().equals(ip)) {
                return Optional.of(instance);
            }
        }
        return Optional.empty();
    }

    public Map<String, List<MSvcInstance>> getInstancesGroupByClusterId() {
        Map<String, List<MSvcInstance>> resultMap = new HashMap<>();
        for (MSvcInstance instance : this.objectMap.values()) {
            if (!resultMap.containsKey(instance.getClusterId())) {
                resultMap.put(instance.getClusterId(), new ArrayList<>());
            }
            resultMap.get(instance.getClusterId()).add(instance);
        }
        return resultMap;
    }

    public Optional<MSvcInstance> getByClusterIdAndRegistryId(String clusterId, String registryId) {
        for (MSvcInstance instance : this.objectMap.values()) {
            if (instance.getClusterId().equals(clusterId) && instance.getRegistryId().equals(registryId)) {
                return Optional.of(instance);
            }
        }
        return Optional.empty();
    }

    public List<MSvcInstance> getInstanceByNodeId(String nodeId) {
        return this.objectMap.values().stream()
                .filter(s -> s.getNodeId().equals(nodeId)).collect(Collectors.toList());
    }

    public List<MSvcInstance> getInstanceByClusterId(String clusterId) {
        return this.objectMap.values().stream()
                .filter(s -> s.getClusterId().equals(clusterId)).collect(Collectors.toList());
    }

    public Map<String, Map<String, Integer>> getSvcInstMap() {
        Map<String, Map<String, Integer>> resultInstMap = new HashMap<>();
        for (MSvcInstance svcInstance : this.getAllValues()) {
            if (!resultInstMap.containsKey(svcInstance.getNodeId())) {
                resultInstMap.put(svcInstance.getNodeId(), new HashMap<>());
            }

            resultInstMap.get(svcInstance.getNodeId()).put(
                    svcInstance.getServiceId(),
                    resultInstMap.get(svcInstance.getNodeId()).getOrDefault(svcInstance.getServiceId(), 0) + 1
            );
        }
        return resultInstMap;
    }

    public List<MSvcInstance> getInstByNodeIdAndSvcId(String currNodeId, String svcId) {
        List<MSvcInstance> resultList = new ArrayList<>();
        for (MSvcInstance inst : this.getInstanceByNodeId(currNodeId)) {
            if (svcId.equals(inst.getServiceId())) {
                resultList.add(inst);
            }
        }
        return resultList;
    }
}
