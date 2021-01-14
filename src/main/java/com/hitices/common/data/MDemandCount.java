package com.hitices.common.data;

import com.hitices.common.service.dependency.PureSvcDependency;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author septemberhx
 * @date 2020/9/22
 **/

@Getter
@Setter
@ToString
public class MDemandCount {

    private PureSvcDependency funDemand;

    private int count;
}
