package com.hitices.common.service.dependency;

import com.hitices.common.service.MSvcVersion;
import lombok.Getter;
import lombok.ToString;

import java.util.Set;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/2/29
 */
@Getter
@ToString
public class SvcVerDependency extends BaseSvcDependency {

    public SvcVerDependency(String id, String serviceName, String patternUrl, Set<MSvcVersion> versionSet) {
        this.id = id;
        PureSvcDependency dep = new PureSvcDependency();
        dep.setServiceName(serviceName);
        dep.setPatternUrl(patternUrl);
        dep.setVersionSet(versionSet);
        this.setDep(dep);
    }
}
