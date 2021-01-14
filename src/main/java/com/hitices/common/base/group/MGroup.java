package com.hitices.common.base.group;

import com.hitices.common.base.MEndPoint;
import com.hitices.common.base.MUniqueObject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author septemberhx
 * @date 2020/7/27
 *
 * This class describes logical group information. Physical information is not included.
 **/

@Getter
@Setter
@ToString
public class MGroup extends MUniqueObject {

    /**
     * Entry point
     */
    private MEndPoint entry;

    /**
     * Group member description
     */
    private MGroupScope scope;
}
