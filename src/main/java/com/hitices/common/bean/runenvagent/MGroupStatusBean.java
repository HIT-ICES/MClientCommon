package com.hitices.common.bean.runenvagent;

import com.hitices.common.base.MEndPoint;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

/**
 * @author septemberhx
 * @date 2021/1/17 9:08 下午
 * @version 0.1
 *
 * Description:
 */
@Getter
@Setter
@ToString
public class MGroupStatusBean {
    private boolean delete = false;
    private String groupId;
    private MEndPoint groupEntry;
    private Set<String> groupInstIps;
    private Set<String> groupNodeIps;
}
