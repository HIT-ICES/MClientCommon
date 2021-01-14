package com.hitices.common.bean.gateway;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

/**
 * @author septemberhx
 * @date 2020/12/29
 **/

@Getter
@Setter
@ToString
public class MCallCoeBaseDataBean {

    /*
     *  Map [ caller interface id, Map [ called interface id, coe ]]
     */
    private Map<String, Map<String, Integer>> callerCalledCountMap;

    /*
     * Map [ called interface id, count ]
     */
    private Map<String, Integer> calledCountMap;
}
