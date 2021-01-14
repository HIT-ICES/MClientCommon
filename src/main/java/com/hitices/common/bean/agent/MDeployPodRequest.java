package com.hitices.common.bean.agent;

import com.hitices.common.base.MEndPoint;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MDeployPodRequest {
    private String id;
    private String nodeId;
    private String uniqueId;
    private String serviceName;
    private String imageUrl;
    private MEndPoint callbackEntry;

    public MDeployPodRequest(String id, String nodeId, String uniqueId, String serviceName, String imageUrl, MEndPoint callbackEntry) {
        this.id = id;
        this.nodeId = nodeId;
        this.uniqueId = uniqueId;
        this.serviceName = serviceName;
        this.imageUrl = imageUrl;
        this.callbackEntry = callbackEntry;
    }

    public MDeployPodRequest() {
    }
}
