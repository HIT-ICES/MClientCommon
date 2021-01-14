package com.hitices.common.bean.agent;

import com.hitices.common.base.node.MNodeConnectionInfo;
import lombok.Getter;
import lombok.Setter;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2019/11/24
 */
@Getter
@Setter
public class MConnectionJson {
    private String successor;
    private String predecessor;
    private MNodeConnectionInfo connection;
}