package com.hitices.common.bean.gateway;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

/**
 * @author septemberhx
 * @date 2021/1/9
 **/

@Setter
@Getter
@ToString
public class MGroupInstanceIpSetBean {

    private Set<String> ipSet;
}
