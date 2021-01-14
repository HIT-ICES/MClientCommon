package com.hitices.common.bean.mclient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

/**
 * @author septemberhx
 * @date 2021/1/11
 *
 * Necessary information to initialize the service instances after instances start up
 **/

@Getter
@Setter
@ToString
public class MInstInitBean {

    /**
     * The ip address set of the gateway instances in current group.
     * It is used to identify whether the gateway instance is in the same group as the service instances or not.
     * It only affects the requests routing in MVerRequestUtils
     */
    private Set<String> groupGatewayIpSet;
}
