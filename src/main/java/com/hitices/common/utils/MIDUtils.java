package com.hitices.common.utils;

import com.hitices.common.base.job.MJobType;
import org.apache.commons.lang.RandomStringUtils;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/1/6
 */
public class MIDUtils {
    private static Long lastJobIdTimeMills = 0L;
    private static int jobCountEachMill = 0;

    private static Long lastInstanceIdTimeMills = 0L;
    private static int instanceCountEachMill = 0;

    private final static String INSTANCE_ID_PREFIX = "INST";
    private final static String USER_ID_PREFIX = "USER";

    /**
     * Generate unique job id
     */
    public static synchronized String uniqueJobId(MJobType jobType, String groupName) {
        long currTimeMills = System.currentTimeMillis();
        if (currTimeMills != lastJobIdTimeMills) {
            MIDUtils.jobCountEachMill = 0;
            MIDUtils.lastJobIdTimeMills = currTimeMills;
        } else {
            ++MIDUtils.jobCountEachMill;
        }

        return String.format("%s_%s_%s_%s", groupName, jobType.toString(), MIDUtils.lastJobIdTimeMills, MIDUtils.jobCountEachMill);
    }

    public static String uniqueInterfaceId(String serviceId, String interfacePatternUrl) {
        return String.format("%s_%s", serviceId, interfacePatternUrl.replaceAll("/", ""));
    }

    public static synchronized String uniqueInstanceId(String serviceName, String versionStr, String groupName) {
        long currTimeMills = System.currentTimeMillis();
        if (currTimeMills != lastInstanceIdTimeMills) {
            MIDUtils.instanceCountEachMill = 0;
            MIDUtils.lastInstanceIdTimeMills = currTimeMills;
        } else {
            ++MIDUtils.instanceCountEachMill;
        }

        String verStr = new String(versionStr);
        verStr = verStr.replace(".", "-");
        return String.format(
                "%s-%s-%s-%s-%s", groupName.toLowerCase(), serviceName.toLowerCase(), verStr, MIDUtils.lastJobIdTimeMills, MIDUtils.instanceCountEachMill);
    }

    public static boolean checkIfUserId(String idStr) {
        return idStr != null && idStr.startsWith(USER_ID_PREFIX);
    }

    public static boolean checkIfInstId(String idStr) {
        return idStr != null && idStr.startsWith(INSTANCE_ID_PREFIX);
    }

    public static void main(String[] args) {
        System.out.println(uniqueInstanceId("SampleGaoDe", "1.2.3", ""));
    }
}
