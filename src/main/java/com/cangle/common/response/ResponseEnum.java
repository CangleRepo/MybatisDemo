package com.cangle.common.response;

/**
 * @author raorui
 * @date 2022/6/16 14:50
 */
public enum ResponseEnum {
    /**
     * 状态枚举：状态码，状态信息
     */
    SUCCESS(1,"成功"),
    FAILURE(0, "失败");

    public final int code;
    public final String desc;

    ResponseEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
