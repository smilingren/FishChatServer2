package org.miaohong.jobs.msgjob.dal.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by miaohong on 17/1/14.
 */
public class KafkaP2PMsg {
    //@JSONField(name="sourceUID")
    private Long incrementID;
    private Long sourceUID;
    private Long targetUID;
    private String msgID;
    private String Msg;
    private String AccessServerAddr;
    private Boolean Online;
}
