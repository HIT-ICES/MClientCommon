package com.hitices.common.base.job;

import lombok.Getter;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2019/10/13
 */
@Getter
public class MDeleteJob extends MBaseJob {
    private String instanceId;
    private String serviceId;
    private String nodeId;

    public MDeleteJob(String instanceId, String serviceId, String nodeId) {
        this(instanceId, serviceId, nodeId, "");
    }

    public MDeleteJob(String instanceId, String serviceId, String nodeId, String groupName) {
        super(MJobType.JOB_DELETE, groupName);
        this.instanceId = instanceId;
        this.serviceId = serviceId;
        this.nodeId = nodeId;
    }

    @Override
    public String toString() {
        return "MDeleteJob{" +
                "instanceId='" + instanceId + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
