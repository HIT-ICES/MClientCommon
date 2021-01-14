package com.hitices.common.base.group;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author septemberhx
 * @date 2020/7/25
 *
 * This class describes the node members in the group.
 *
 * Attention: All the physical information about node are directly loaded on the orchestration server,
 *   including the ip and node id of each node. Thus, group scope only store the ip list,
 *   which means once a group agent starts and claims its scope, the orchestration server needs to
 *   send necessary physical information to the group agent.
 *
 *   It is designed like this so that we could reuse most of the code of orchestration server,
 *   and it also make sense since the group assignment is only at logical level instead of physical level.
 *
 *   This class can only holds the node id list of one group. DO NOT put other information in this class
 **/

@Getter
@Setter
@ToString
public class MGroupScope {

    /**
     * node id of the node which the group agent runs on
     */
    private String agentNodeId;

    /**
     * id list of the nodes in this group. The master id IS ALSO contained.
     */
    private List<String> nodeIdList;

    public MGroupScope() {
        this.nodeIdList = new ArrayList<>();
    }

    public MGroupScope(String agentNodeId, List<String> nodeIdList) {
        this.agentNodeId = agentNodeId;
        this.nodeIdList = nodeIdList;
    }
}
