package com.hitices.common.service;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/2/29
 *
 * Service Leverage Agreement for users and services
 *
 * This class is created for possible future extension
 */
@Getter
@Setter
public class MSla {

    private int level;

    public MSla() {}

    public MSla(int level) {
        this.level = level;
    }

    public MSla(MSla sla) {
        this.level = sla.level;
    }

    public boolean ifSatisfied(MSla other) {
        return this.level == other.level;
    }

    @Override
    public String toString() {
        return "MSla{" +
                "level=" + level +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MSla sla = (MSla) o;
        return level == sla.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(level);
    }
}
