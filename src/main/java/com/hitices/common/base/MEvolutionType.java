package com.hitices.common.base;

/**
 * @author septemberhx
 * @date 2020/9/29
 **/
public enum MEvolutionType {

    /**
     * No need to evolve
     */
    NO_NEED,

    /**
     * Need to evolve (Only used in MGroupAgent with distributed algorithms)
     */
    DISTRIBUTED_EVOLVE,
}
