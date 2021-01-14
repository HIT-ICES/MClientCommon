package com.hitices.common.bean.gateway;

import com.hitices.common.service.MService;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author septemberhx
 * @date 2021/1/10
 **/

@Getter
@Setter
@ToString
public class MSvcListBean {

    /**
     * All the services in this system
     */
    private List<MService> svcList;

    public MSvcListBean(List<MService> svcList) {
        this.svcList = svcList;
    }

    public MSvcListBean() {
    }
}
