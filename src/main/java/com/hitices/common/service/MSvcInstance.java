package com.hitices.common.service;

import com.hitices.common.base.MUniqueObject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;
import java.util.Set;


/**
 * This class stores almost every thing about a service instance.
 * Normally the information contained in this class cannot be fetched by one XXXEnvAgent directly.
 * Some attributes come from MSvcEnvAgent, and others come from MRunEnvAgent.
 * It may contain some other attributes that cannot be fetched from XXXEnvAgent,
 *   and these attributes need to be waited for XXXAgent or server
 */
@Getter
@Setter
@ToString
public class MSvcInstance extends MUniqueObject {

    // we use the pod id as the unique id of instance

    /**
     * Shows which cluster this instance belongs to
     */
    private String clusterId;

    /**
     * Shows which server node this instance belongs to
     */
    private String nodeId;

    /**
     * Ip of the pod
     */
    private String ip;

    /**
     * Port of the pod
     */
    private Integer port;

    /**
     * The actual pod id in the K8S. It should be unique although there may have many clusters
     * this.podId should equals this.id
     */
    private String podId;

    /**
     * Unique Id assigned by registry, e.g. Eureka
     */
    private String registryId;

    /**
     * Service may have different versions, and all the versions have the same service name
     */
    private String serviceName;

    /**
     * Service version
     */
    private MSvcVersion version;

    /**
     * Each service version has unique service id
     *
     * This attribute is for the convenience of fetching the corresponding service in the system.
     * And this attribute cannot be fetched directly from the service instance.
     * It needs to be written by agent or server according to the service name and service version.
     */
    private String serviceId;

    /**
     * For the possible future works. Not used for now
     */
    private Set<String> mObjectIdSet;

    /**
     * For the possible future works. Not used for now
     */
    private Map<String, String> parentIdMap;

    public MSvcInstance() {}

    public MSvcInstance(Map<String, String> parentIdMap, String clusterId, String nodeId, String ip, Integer port,
                        String instanceId, Set<String> mObjectIdSet, String serviceName, String serviceId, String registryId, MSvcVersion version) {
        this.parentIdMap = parentIdMap;
        this.clusterId = clusterId;
        this.nodeId = nodeId;
        this.ip = ip;
        this.port = port;
        this.id = instanceId;
        this.mObjectIdSet = mObjectIdSet;
        this.serviceName = serviceName;
        this.serviceId = serviceId;

        // We use the unique instance id as the pod id
        // Thus only a-z,A-Z,-,0-9 should be used as the instance id
        this.podId = instanceId;

        this.registryId = registryId;
        this.version = version;
    }

    public MSvcInstance deepClone() {
        return new MSvcInstance(
                this.parentIdMap,
                this.clusterId,
                this.nodeId,
                this.ip,
                this.port,
                this.id,
                this.mObjectIdSet,
                this.serviceName,
                this.serviceId,
                this.registryId,
                this.version
        );
    }
}
