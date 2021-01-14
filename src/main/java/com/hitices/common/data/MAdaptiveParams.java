package com.hitices.common.data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

/**
 * @author septemberhx
 * @date 2020/7/25
 **/

@Getter
@Setter
@ToString
public class MAdaptiveParams {

    private double maxCost;

    private Map<String, Double> priceMap;
}
