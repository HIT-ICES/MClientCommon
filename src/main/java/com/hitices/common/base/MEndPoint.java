package com.hitices.common.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/3/11
 */
@ToString
@Getter
@Setter
public class MEndPoint {
    private String ip;
    private Integer port;

    public MEndPoint(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
    }

    public MEndPoint() {
    }
}
