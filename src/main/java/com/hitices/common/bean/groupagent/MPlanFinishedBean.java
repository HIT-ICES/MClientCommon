package com.hitices.common.bean.groupagent;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author septemberhx
 * @date 2020/8/10
 *
 * Notify others that current group has finished the planer phase
 **/

@Getter
@Setter
@ToString
public class MPlanFinishedBean {

    private String fromGroupId;
}
