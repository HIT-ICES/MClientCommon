package com.hitices.common.bean.gateway;

import com.hitices.common.bean.MResponse;
import com.hitices.common.bean.MRoutingBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/4/15
 */
@Getter
@Setter
@ToString
public class MDepCloudRequestBean {
    private MResponse param;
    private MRoutingBean routingBean;

    public MDepCloudRequestBean(MResponse param, MRoutingBean routingBean) {
        this.param = param;
        this.routingBean = routingBean;
    }

    public MDepCloudRequestBean() {
    }
}
