package com.hitices.common.base.job;

import com.hitices.common.base.MUniqueObject;
import com.hitices.common.utils.MIDUtils;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/1/6
 */
@Getter
@Setter
@ToString
public class MBaseJob extends MUniqueObject {
    protected MJobType type;
    protected MJobStatus status;
    protected String callbackUrl;

    public MBaseJob(MJobType jobType) {
        this(jobType, "");
    }

    public MBaseJob(MJobType jobType, String groupName) {
        this.type = jobType;
        this.id = MIDUtils.uniqueJobId(this.type, groupName);
        this.markAsPending();
    }

    public void markAsPending() {
        this.status = MJobStatus.PENDING;
    }

    public void markAsDoing() {
        this.status = MJobStatus.DOING;
    }

    public void markAsDone() {
        this.status = MJobStatus.DONE;
    }
}
