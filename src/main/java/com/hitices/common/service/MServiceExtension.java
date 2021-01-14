package com.hitices.common.service;

import com.hitices.common.base.MResource;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to hold other attributes that are affected by other factors
 *
 * @author septemberhx
 * @date 2020/9/21
 **/

public class MServiceExtension {

    /**
     * It describes how many requests can be handled each second with the given resource
     *   List is used instead of Map because this will only be used on the startup of the system, and List is easier to analyzer from json
     */
    private List<MResource> resourceList;
    private List<Double> abilityList;

    public double getSvcAbility(MResource resource) {
        int index = resourceList.indexOf(resource);
        if (index >= 0) {
            return this.abilityList.get(index);
        } else {
            return 0.0;
        }
    }

    public List<MResource> getResourceConstraints() {
        return this.resourceList;
    }

    public void updateAbility(MResource resource, double ability) {
        int index = resourceList.indexOf(resource);
        if (index >= 0) {
            this.abilityList.set(index, ability);
        } else {
            this.resourceList.add(resource);
            this.abilityList.add(ability);
        }
    }

    public MServiceExtension() {
        this.abilityList = new ArrayList<>();
        this.resourceList = new ArrayList<>();
    }
}
