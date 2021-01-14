package com.hitices.common.bean.server;

import com.hitices.common.base.MResource;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/1/1
 */
@Getter
@Setter
public class MServiceRegisterBean {
    private String serviceName;
    private String gitUrl;
    private Map<String, Double> abilityMap;
    private Map<String, MResource> resMap;
    private Map<String, Integer> plotMap;
    private Map<String, Map<String, Map<String, Integer>>> invokeMap;
}
