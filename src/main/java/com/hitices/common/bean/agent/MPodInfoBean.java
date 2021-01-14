package com.hitices.common.bean.agent;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
public class MPodInfoBean {
    private String hostIp;

    /**
     * instance id that k8s assigns to it
     */
    private String podId;

    /**
     * instance ip (pod ip address)
     */
    private String podIp;

    /**
     * Cluster Id that this pod belongs to
     */
    private String clusterId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MPodInfoBean that = (MPodInfoBean) o;
        return Objects.equals(hostIp, that.hostIp) &&
                Objects.equals(podId, that.podId) &&
                Objects.equals(podIp, that.podIp) &&
                Objects.equals(clusterId, that.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostIp, podId, podIp, clusterId);
    }
}
