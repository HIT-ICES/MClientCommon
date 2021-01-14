package com.hitices.common.bean.gateway;

import com.hitices.common.data.MDemandCount;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author septemberhx
 * @date 2020/9/22
 **/

@ToString
@Getter
@Setter
public class MDemandsCountBean {

    /**
     * Use List instead of Map to avoid demand hash collision
     */
    private List<MDemandCount> demandCounts;
}
