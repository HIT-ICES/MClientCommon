package com.hitices.common.bean.server.group;

import com.hitices.common.base.group.MGroup;
import com.hitices.common.base.node.MServerNode;
import com.hitices.common.service.MService;
import com.hitices.common.base.node.MNodeConnectionInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

/**
 * @author septemberhx
 * @date 2020/7/27
 *
 * The response bean will be return when the group agent registers itself to the server.
 *   It contains some group related physical.
 **/

@Getter
@Setter
@ToString
public class MGroupRegisterResponse {

    /**
     * All the group entries
     */
    private List<MGroup> groups;

    /**
     * All the server nodes in this group
     */
    private List<MServerNode> nodeList;

    /**
     * The connection map that contains all the connection details between ALL nodes in the system.
     *   It should be noted that the group is designed at the logical level instead of the physical level.
     */
    private Map<String, Map<String, MNodeConnectionInfo>> connectionMap;

    /**
     * All the services in this system
     */
    private List<MService> svcList;
}
