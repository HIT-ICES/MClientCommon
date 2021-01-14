package com.hitices.common.bean.server.dep;

import com.hitices.common.base.user.MUser;
import com.hitices.common.service.dependency.BaseSvcDependency;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/3/7
 */
@ToString
@Setter
@Getter
public class MDepUserRequestBean {
    private MUser user;
    private BaseSvcDependency baseSvcDependency;
}
