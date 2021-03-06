package com.hitices.common.bean.svcenvagent;

import com.hitices.common.service.MSvcVersion;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/7/11
 */
@Getter
@Setter
@ToString
public class MSvcEnvInfoBean {
    /**
     * Unique id that the register server assigns to it
     */
    private String registryId;
    private String ip;
    private int port;
    private MSvcVersion version;
    private String serviceName;

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        MSvcEnvInfoBean that = (MSvcEnvInfoBean) o;
        return port == that.port &&
                Objects.equals(registryId, that.registryId) &&
                Objects.equals(ip, that.ip) &&
                Objects.equals(version, that.version) &&
                Objects.equals(serviceName, that.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registryId, ip, port, version, serviceName);
    }
}
