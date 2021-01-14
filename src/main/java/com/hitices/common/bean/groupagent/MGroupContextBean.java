package com.hitices.common.bean.groupagent;

import com.hitices.common.service.dependency.PureSvcDependency;
import com.hitices.common.bean.gateway.MCallCoeBaseDataBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

/**
 * @author septemberhx
 * @date 2020/7/23
 *
 * Context info for each group. The information it contains depends on the context level
 *
 **/
@Getter
@Setter
@ToString
public class MGroupContextBean {

    private MGroupContextLevel contextLevel;

    private List<String> nodeIdFixedList;

    /**
     * Map[Node Id,
     *   Map[Demand, request frequency per second]
     * ]
     */
    private Map<String, Map<PureSvcDependency, Double>> reqFreqMap;

    private MCallCoeBaseDataBean callCoeBaseData;

    public MGroupContextBean() {}

}
