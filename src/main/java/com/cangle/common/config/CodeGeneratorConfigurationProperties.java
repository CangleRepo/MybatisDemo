package com.cangle.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author raorui
 */
@ConfigurationProperties(prefix = "code-generator")
public class CodeGeneratorConfigurationProperties {
    /**
     * 程序所处部署机器所处数据中心id
     */
    private long centerid;

    /** 程序部署所在的机器编号*/
    private long   machineid;

    public long getCenterid() {
        return centerid;
    }

    public void setCenterid(long centerid) {
        this.centerid = centerid;
    }

    public long getMachineid() {
        return machineid;
    }

    public void setMachineid(long machineid) {
        this.machineid = machineid;
    }
}
