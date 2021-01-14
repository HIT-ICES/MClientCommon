package com.hitices.common.bean.agent;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class MInstanceInfoResponse {
    List<MInstanceInfoBean> infoBeanList;
}
