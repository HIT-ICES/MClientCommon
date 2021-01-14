package com.hitices.common.bean.server;

import com.hitices.common.service.MService;
import lombok.Getter;
import lombok.Setter;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/1/1
 */
@Getter
@Setter
public class MServiceCompareBean {
    private MService fixedService;
    private MService comparedService;
}
