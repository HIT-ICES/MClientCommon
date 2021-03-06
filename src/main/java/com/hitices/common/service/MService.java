package com.hitices.common.service;

import com.hitices.common.service.dependency.*;
import com.hitices.common.base.MResource;
import com.hitices.common.base.MUniqueObject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Service class. The same services with different resource requirements are treated as different services with same service name
 *
 * @author SeptemberHX
 * @version 0.1
 * @date 2019/12/13
 */
@Getter
@Setter
@ToString
public class MService extends MUniqueObject {
    /*
     * The service name is not the same as the serviceId.
     * For two services, they can have the same service name with different version.
     */
    private String serviceName;
    private MSvcVersion serviceVersion;
    private String gitUrl;
    private int port;
    private String imageUrl;
    private Integer maxPlotNum;

    /*
     * Map [ pattern url, MSvcInterface ]
     */
    private Map<String, MSvcInterface> serviceInterfaceMap;
    private MSvcDepDesc mSvcDepDesc;

    /**
     * DO NOT change the code above. Unless in reconstruction
     */
    private MServiceExtension svcExtension;

    public MService() {
        this.svcExtension = new MServiceExtension();
        this.serviceInterfaceMap = new HashMap<>();
    }

    /**
     * Only used when there is only ONE resource constraint level for the service
     */
    public MResource singleResource() {
        return svcExtension.getResourceConstraints().get(0);
    }

    /**
     * Only used when there is only ONE resource constraint level for the service
     */
    public double singleAbility() {
        return svcExtension.getSvcAbility(this.singleResource());
    }

    /**
     * Only used when there is only ONE resource constraint level for the service
     */
    public void setSingleResource(MResource resource, double ability) {
        this.svcExtension.updateAbility(resource, ability);
    }

    /**
     * Get the interface list that use the given dependency
     */
    public List<MSvcInterface> getInterfacesContainDep(BaseSvcDependency dependency) {
        return this.serviceInterfaceMap.values().stream()
                .filter(s -> s.getInvokeCountMap().containsKey(dependency.hashCode())).collect(Collectors.toList());
    }

    public Optional<MSvcInterface> getInterfaceByPatternUrl(String patternUrl) {
        return Optional.of(this.serviceInterfaceMap.get(patternUrl));
    }

    public Optional<BaseSvcDependency> getDepByHashCode(int hashcode) {
        for (BaseSvcDependency svcDependency : this.allDepList()) {
            if (svcDependency.hashCode() == hashcode) {
                return Optional.of(svcDependency);
            }
        }
        return Optional.empty();
    }

    public List<BaseSvcDependency> allDep() {
        List<BaseSvcDependency> resultList = new ArrayList<>();
        for (String depName : this.mSvcDepDesc.getDependencyMaps().keySet()) {
            resultList.addAll(this.mSvcDepDesc.getDependencyMaps().get(depName).values());
        }
        return resultList;
    }

    public Optional<BaseSvcDependency> getDepById(String id) {
        for (BaseSvcDependency svcDependency : this.allDepList()) {
            if (svcDependency.getId().equals(id)) {
                return Optional.of(svcDependency);
            }
        }
        return Optional.empty();
    }

    public Optional<MSvcInterface> getInterfaceByDep(PureSvcDependency svcDependency) {
        BaseSvcDependency dep = BaseSvcDependency.tranPure(svcDependency);
        for (MSvcInterface api : this.serviceInterfaceMap.values()) {
            if (dep instanceof SvcVerDependency) {
                if (dep.getVersionSet().contains(this.serviceVersion)
                        && dep.getServiceName().toLowerCase().equals(this.serviceName.toLowerCase())
                        && dep.getPatternUrl().equals(api.getPatternUrl())) {
                    return Optional.of(api);
                }
            } else if (dep instanceof SvcSlaDependency) {
                if (dep.getServiceName().toLowerCase().equals(this.serviceName.toLowerCase())
                        && dep.getPatternUrl().equals(api.getPatternUrl())
                        && dep.getSlaSet().contains(api.getFuncDescription().getSla())) {
                    return Optional.of(api);
                }
            } else if (dep instanceof SvcFuncDependency) {
                if (dep.getFunc().equals(api.getFuncDescription().getFunc())
                        && dep.getSlaSet().contains(api.getFuncDescription().getSla())) {
                    return Optional.of(api);
                }
            }
        }
        return Optional.empty();
    }

    public boolean ifSatisfied(MFunc func, MSla sla) {
        for (MSvcInterface api : this.serviceInterfaceMap.values()) {
            if (api.getFuncDescription().ifSatisfied(func, sla)) {
                return true;
            }
        }
        return false;
    }

    public List<BaseSvcDependency> allDepList() {
        return this.mSvcDepDesc.allDepList();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MService service = (MService) o;

        if (this.serviceInterfaceMap.size() != service.serviceInterfaceMap.size()) {
            return false;
        }
        for (String interfaceId : this.serviceInterfaceMap.keySet()) {
            if (!this.serviceInterfaceMap.get(interfaceId).equals(service.serviceInterfaceMap.get(interfaceId))) {
                return false;
            }
        }

        return port == service.port &&
                Objects.equals(serviceName, service.serviceName) &&
                Objects.equals(serviceVersion, service.serviceVersion) &&
                Objects.equals(gitUrl, service.gitUrl) &&
                Objects.equals(imageUrl, service.imageUrl);
    }

    public MSvcInterface getInterfaceById(String interfaceId) {
        for (MSvcInterface svcInterface : this.serviceInterfaceMap.values()) {
            if (svcInterface.getId().equals(interfaceId)) {
                return svcInterface;
            }
        }
        return null;
    }

    public void updateDeps(List<BaseSvcDependency> deps) {
        this.mSvcDepDesc.updateDeps(deps);
        for (MSvcInterface svcInterface : this.serviceInterfaceMap.values()) {
            svcInterface.updateDeps(deps);
        }
    }
}
