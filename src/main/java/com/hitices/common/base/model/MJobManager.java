package com.hitices.common.base.model;

import com.hitices.common.base.MUniqueObjectManager;
import com.hitices.common.base.job.MBaseJob;
import com.hitices.common.base.job.MJobStatus;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/1/6
 */
public class MJobManager extends MUniqueObjectManager<MBaseJob> {

    public boolean checkAllJobDone() {
        for (MBaseJob job : this.getAllValues()) {
            if (job.getStatus() != MJobStatus.DONE) {
                return false;
            }
        }
        return true;
    }
}
