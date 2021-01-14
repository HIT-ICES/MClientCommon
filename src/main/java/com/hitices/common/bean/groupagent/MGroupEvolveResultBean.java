package com.hitices.common.bean.groupagent;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

/**
 * @author septemberhx
 * @date 2021/1/11
 **/

@Getter
@Setter
@ToString
public class MGroupEvolveResultBean {


    /**
     * The group must abandon some requests due to limited resources
     *
     * Map [ Service ID, Map [ NodeId, Map[Interface ID, Frequency ]]]
     */
    private Map<String, Map<String, Map<String, Double>>> abandonedRequests;
}
