package com.hitices.common.bean.agent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MFetchLogsBetweenTimeRequest {
    private long startTime;
    private long endTime;
}
