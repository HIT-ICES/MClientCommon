package com.hitices.common.bean.agent;

import com.hitices.common.bean.mclient.MInstanceRestInfoBean;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MSetRestInfoRequest {
    private MInstanceRestInfoBean restInfoBean;
    private String instanceId;
}
