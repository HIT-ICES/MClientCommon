package com.hitices.common.base.node;

import com.hitices.common.base.MUniqueObject;
import com.hitices.common.base.MPosition;
import com.hitices.common.base.MResource;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MServerNode extends MUniqueObject {
    private ServerNodeType nodeType;
    private MResource resource;
    private MPosition position;
    private String ip;
    private String clusterId;

    @Override
    public String toString() {
        return "MServerNode{" +
                "nodeType=" + nodeType +
                ", resource=" + resource +
                ", position=" + position +
                ", ip='" + ip + '\'' +
                ", clusterId='" + clusterId + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
