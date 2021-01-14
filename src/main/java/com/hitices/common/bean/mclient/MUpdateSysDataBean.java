package com.hitices.common.bean.mclient;

import com.hitices.common.service.MService;
import com.hitices.common.service.MSvcInstance;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/3/19
 */
@Getter
@Setter
@ToString
public class MUpdateSysDataBean {
    private List<MService> svcList;
    private List<MSvcInstance> instList;
}
