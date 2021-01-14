package com.hitices.common.bean.runenvagent;

import com.hitices.common.bean.agent.MPodInfoBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author septemberhx
 * @date 2020/7/28
 **/

@Getter
@Setter
@ToString
public class MRunEnvInfoResponse {

    List<MPodInfoBean> podInfoList;
}
