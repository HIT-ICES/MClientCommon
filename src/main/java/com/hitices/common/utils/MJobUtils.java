package com.hitices.common.utils;

import com.hitices.common.base.job.MDeleteJob;
import com.hitices.common.base.job.MDeployJob;
import com.hitices.common.service.MService;

/**
 * @author septemberhx
 * @date 2021/1/2
 **/

public class MJobUtils {

    /**
     * create a deploy job
     * @param nodeId target node id
     * @param svc target service
     * @param groupName who wants to create this job
     * @return MDeployJob
     */
    public static MDeployJob createDeployJob(String nodeId, MService svc, String groupName) {
        return new MDeployJob(
                nodeId,
                svc.getServiceName(),
                MIDUtils.uniqueInstanceId(svc.getServiceName(), svc.getServiceVersion().toString(), groupName),
                svc.getImageUrl(),
                groupName
        );
    }

    /**
     * create a delete job
     * @param instanceId target instance id
     * @param svcId target service
     * @param nodeId target node
     * @param groupName who wants to create this job
     * @return MMDeleteJob
     */
    public static MDeleteJob createDeleteJob(String instanceId, String svcId, String nodeId, String groupName) {
        return new MDeleteJob(instanceId, svcId, nodeId, groupName);
    }
}
