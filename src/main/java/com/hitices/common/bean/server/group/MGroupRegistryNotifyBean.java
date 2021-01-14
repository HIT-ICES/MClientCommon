package com.hitices.common.bean.server.group;

import com.hitices.common.base.group.MGroup;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author septemberhx
 * @date 2020/7/27
 *
 * This class is used to notify existing groups that a new group is registered
 *   and share necessary information about the new group to them.
 **/

@Getter
@Setter
@ToString
public class MGroupRegistryNotifyBean {

    /**
     * The entry of the new registered group
     */
    private MGroup newGroup;

    public MGroupRegistryNotifyBean(MGroup newGroup) {
        this.newGroup = newGroup;
    }

    public MGroupRegistryNotifyBean() {
    }
}
