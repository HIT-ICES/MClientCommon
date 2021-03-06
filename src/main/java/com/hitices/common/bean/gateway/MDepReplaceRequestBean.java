package com.hitices.common.bean.gateway;

import com.hitices.common.bean.MResponse;
import com.hitices.common.bean.MRoutingBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/3/23
 */
@Getter
@Setter
@ToString
public class MDepReplaceRequestBean {
    private MResponse param;
    private MRoutingBean rawRoutingBean;
    private String replacementId;

    public MDepReplaceRequestBean(MResponse param, MRoutingBean rawRoutingBean, String replacementId) {
        this.param = param;
        this.rawRoutingBean = rawRoutingBean;
        this.replacementId = replacementId;
    }

    public MDepReplaceRequestBean() { }
}
