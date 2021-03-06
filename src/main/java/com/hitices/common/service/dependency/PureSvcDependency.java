package com.hitices.common.service.dependency;

import com.hitices.common.service.MFunc;
import com.hitices.common.service.MSla;
import com.hitices.common.service.MSvcVersion;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/3/11
 */
@Getter
@Setter
@ToString
public class PureSvcDependency {
    protected MFunc func;

    // service name
    protected String serviceName;

    // prefer sla level
    protected Set<MSla> slaSet;

    // API url
    protected String patternUrl;

    // the version of ${serviceName}
    protected Set<MSvcVersion> versionSet;

    public PureSvcDependency(MFunc func, String serviceName, Set<MSla> slaSet, String patternUrl, Set<MSvcVersion> versionSet) {
        this.func = func;
        this.serviceName = serviceName;
        this.slaSet = slaSet;
        this.patternUrl = patternUrl;
        this.versionSet = versionSet;
    }

    public PureSvcDependency() {
    }

    public boolean checkIfRestrictest() {
        return serviceName != null && patternUrl != null && versionSet.size() == 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PureSvcDependency that = (PureSvcDependency) o;
        return Objects.equals(func, that.func) &&
                Objects.equals(serviceName, that.serviceName) &&
                equalsForSet(slaSet, that.slaSet) &&
                Objects.equals(patternUrl, that.patternUrl) &&
                equalsForSet(versionSet, that.versionSet);
    }

    @Override
    public int hashCode() {
        List<Object> objects = new ArrayList<>();
        objects.add(func);
        objects.add(serviceName);
        objects.add(patternUrl);
        if (slaSet != null) {
            objects.addAll(slaSet);
        }
        if (versionSet != null) {
            objects.addAll(versionSet);
        }
        return Arrays.hashCode(objects.toArray());
    }


    public static boolean equalsForSet(Set<?> set1, Set<?> set2) {
        if ((set1 == null && set2 != null) || (set1 != null && set2 == null)) {
            return false;
        } else if (set1 == null && set2 == null) {
            return true;
        }

        if (set1.size() != set2.size()) {
            return false;
        }
        return set1.containsAll(set2);
    }
}
