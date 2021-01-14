package com.hitices.common.bean.groupagent;

import lombok.Getter;
import lombok.Setter;

/**
 * @author septemberhx
 * @date 2020/7/24
 *
 * Group context request bean. It holds all the needed information to fetch context info in target group
 **/
@Getter
@Setter
public class MGCRequestBean {

    /**
     * The group id of whom asks for the group context
     */
    private String fromGroupId;

    /**
     * The context level the sender asks for.
     *   It should be used when trying to study the impact of different context scope
     */
    private MGroupContextLevel contextLevel;

}
