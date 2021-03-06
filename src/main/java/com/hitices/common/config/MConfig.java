package com.hitices.common.config;

import lombok.Getter;
import lombok.Setter;

public class MConfig {

    @Getter
    @Setter
    private String mClusterHost;

    @Getter
    @Setter
    private int mClusterPort;

    @Getter
    @Setter
    private String mBuilderUrl;

    public final static String MCLUSTER_FETCH_INSTANCE_INFO = "/magent/instanceInfoList";
    public final static String MCLUSTERAGENT_REQUEST_REMOTE_URI = "/magent/remoteuri";
    public final static String MCLUSTER_SET_REST_INFO = "/mclient/setRestInfo";
    public final static String MCLIENT_SET_APICS_URI = "/mclient/setApiContinueStatus";
    public final static String MCLUSTERAGENT_SET_REST_INFO = "/magent/setRestInfo";
    public final static String MCLUSTERAGENT_DEPLOY_URI = "/magent/deploy";
    public final static String MCLUSTERAGENT_SET_APICS_URI = "/magent/setApiContinueStatus";
    public final static String MCLUSTERAGENT_FETCH_LOGS = "/magent/fetchLogsBetweenTime";
    public static final String MCLUSTERAGENT_DELETE_URI = "/magent/deleteInstance";
    public final static String MCLUSTERAGNET_FETCH_REQUEST_URL = "/magent/fetchRequestUrl";
    public final static String MCLUSTERAGENT_ALL_USER_URL = "/magent/allUser";
    public final static String MCLUSTERAGENT_UPDATE_GATEWAYS = "/magent/updateGateways";
    public final static String MCLUSTERAGENT_DO_REQUEST_URL = "/magent/doRequest";
    public final static String MCLUSTERAGENT_INSTANCE_REGISTER_URL = "/magent/registered";

    public final static String MCLUSTERAGENT_FETCH_CLIENT_INFO = "/mclient/info";
    public final static String MSERVER_GET_REMOTE_URI = "/mserver/remoteuri";
    public final static String MSERVER_FETCH_REQUEST_URL = "/mserver/fetchRequestUrl";
    public final static String MSERVER_DO_REQUEST_URL = "/mserver/doRequest";

    public final static String MCLUSTER_DOCKER_NAMESPACE = "kube-test";

    public final static String BUILD_CENTER_BUILD_URI = "/buildcenter/build";
    public final static String BUILD_CENTER_CBUILD_URI = "/buildcenter/cbuild";

    public final static String MGATEWAY_UPDATE_URI = "/update";
    public final static String MGATEWAY_ALL_USER_URI = "/allUser";


    public final static String K8S_NAMESPACE = "kube-test";
    public final static String MCLUSTERAGENT_NAME = "MClusterAgent";
    public final static String MSVCENV_NAME = "MSvcEnvAgent";
    public static final String MRUNENV_NAME = "MRunEnvAgent";

    public final static String REQUEST_SHOULD_SEND_TO_CLOUD = "request should send to cloud";

    // ------
    public final static String SERVICE_NAME_SERVER = "MOrchestrationServer";
    public final static String SERVER_SERVICE_INFO_CALLBACK_URI = "/service/pushServiceInfos";
    // ------
    public final static String SERVICE_NAME_ANALYZE = "MServiceAnalyser";
    public final static String ANALYZE_ANALYZE_URI = "/analyzer";
    public final static String ANALYZE_ANALYZE_URI_ONE = "/analyzerOne";
    public final static String ANALYZE_COMPARE_URI = "/compare";

    // --- new version ---
    public final static String MSERVER_CLUSTER_REPORT_INSTANCEINFO = "/cluster/reportInstanceInfo";
    public final static String MSERVER_CLUSTER_REGISTER = "/cluster/registerCluster";
    public final static String MSERVER_NEW_DEP_REQUEST = "/request/newDepRequest";
    public final static String MSERVER_REPLACE_CALL = "/request/replaceCall";
    public final static String MSERVER_JOB_NOTIFY_URI = "/job/notify";
    public final static String MSERVER_CLOUD_CALL = "/request/cloudCall";

    public static final String MSERVER_GROUP_REGISTRY_URL = "/group/registry";
    public static final String MSERVER_GROUP_LIST_URL = "/group/list";

    public final static String MCLUSTER_SVC_METADATA_NAME = "mclient";
    public final static String MCLUSTER_SVC_METADATA_VALUE = "true";
    public final static String MCLUSTER_SVC_VER_NAME = "serviceVersion";
    public final static String MCLUSTER_DEP_REQUEST_ROUTING = "/magent/routing";
    public final static String MCLUSTER_UPDATE_SYS_DATA_URI = "/magent/updating";
    public final static String MCLUSTER_DEP_ROUTING_RESET = "/magent/routingReset";
    public final static String MCLUSTER_REPLACE_CALL = "/magent/replaceCall";
    public final static String MCLUSTER_UPDATE_COPY_MAP = "/magent/updateReplace";
    public final static String MCLUSTER_FETCH_DEP_REQUEST = "/magent/fetchDepRequests";
    public final static String MCLUSTER_FETCH_DEP_REQUEST_COUNT = "/magent/fetchDepRequestCount";
    public static final String MCLUSTER_CLOUD_CALL = "/magent/cloudRequest";
    public static final String MCLUSTER_CHANGE_DEP = "/magent/changeDep";

    public final static String MGATEWAY_NAME = "MGateway";
    public final static String MGATEWAY_DEPENDENCY_CALL = "/call/dependency";
    public final static String MGATEWAY_SERVICE_UPDATE = "/service/update";
    public final static String MGATEWAY_DEPENDENCY_ID = "dependency";
    public final static String MGATEWAY_FETCH_REQUESTS = "/evolve/requests";
    public final static String MGATEWAY_FETCH_REQUEST_NUMBER = "/evolve/requestNum";
    public final static String MGATEWAY_UPDATE_COPY_MAP = "/evolve/updateReplace";
    public final static String MGATEWAY_FAILED_REQUESTS = "/evolve/failedRequests";
    public final static String MGATEWAY_FAILED_REQUEST_COUNT = "/evolve/failedRequestCount";

    public final static String MGATEWAY_CALL_BACK_URL_ID = "__call_back_url";
    public static final String MGATEWAY_RETRY_FAILED_REQUESTS = "/evolve/retryFailed";
    public static final String MGATEWAY_RESET_CACHE = "/evolve/resetCache";
    public static final String MGATEWAY_RESET = "/evolve/reset";
    public static final String MGATEWAY_SIMULATION_ID = "__simulate_id";
    public static final String MGATEWAY_CHANGE_DEP = "/evolve/changeDep";
    public static final String MGATEWAY_CALL_COE_RAW_DATA_URL = "/monitor/callCoeRawData";
    public static final String MGATEWAY_ROUND_DEPENDENCY_CALL_URL = "/call/roundDep";
    public static final String MGATEWAY_UPDATE_GROUP_INSTANCE_IP_URL = "/evolve/updateGroupInstIpList";
    public static final String MGATEWAY_UPDATE_SVC_URL = "/evolve/updateSvcList";

    public static final String MCLIENT_CHANGE_DEP = "/mclient/changeDep";
    public static final String MCLIENT_INIT_URL = "/mclient/init";

    public final static String MDPREDICTOR_PREDICT = "/predict";

    public final static String PARAM_USER_ID = "__user_id";
    public final static String PARAM_CLIENT_ID = "__client_id";
    public final static String PARAM_CALLER_URL = "__caller_url";
    public final static String PARAM_CALLED_URL = "__called_url";
    public final static String PARAM_CALLER_INTERFACE_ID = "__caller_interface_id";
    public final static String PARAM_CALLED_INTERFACE_ID = "__called_interface_id";

    public final static String MGROUPAGENT_FETCH_CONTEXT_URL = "/context/get";
    public final static String MGROUPAGENT_ASSIGN_GROUP_URL = "/group/assign";
    public static final String MGROUPAGENT_NOTIFY_PLAN_FINISH_URL = "/notify/planFinished";
    public static final String MGROUPAGENT_NEW_GROUP_NOTIFY_URL = "/notify/newGroup";
    public static final String MGROUPAGENT_EVOLVE_URL = "/group/evolve";
    public static final String MGROUPAGENT_BGCOSTEVOLVE_URL = "/group/bgCostEvolve";

    public static final String MGROUPAGENT_JOB_NOTIFY_URL = "/job/notify";
    public static final String MGROUPAGENT_UPDATE_INSTANCE_INFO_URL = "/group/updateInstInfo";

    // ------ middleware API URL
    public final static String MSVCENV_INSTANCES_URL = "/context/svc/infoList";

    public static final String MRUNENV_PODS_URL = "/context/run/podList";
    public final static String MRUNENV_DEPLOY_URL = "/deploy";
    public final static String MRUNENV_DELETE_URL = "/delete";
    public static final String MRUNENV_INSTANCE_STATUS_CHANGED_URL = "/context/instance/statusChanged";
    public static final String MRUNENV_UPDATE_GROUP_NODE_LIST_URL = "/context/update/groupNodeList";

    private static MConfig ourInstance = new MConfig();

    public static MConfig getInstance() {
        return ourInstance;
    }

    private MConfig() {
        this.setMClusterHost("192.168.1.102");

        this.setMClusterPort(9000);
    }
}
