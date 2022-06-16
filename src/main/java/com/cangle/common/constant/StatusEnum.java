package com.cangle.common.constant;

/**
 * @author raorui
 * @date 2022/6/16 15:27
 */
public enum StatusEnum {
    /**
     * 禁用
     */
    DISABLED(0, "禁用"),
    /**
     * 启用
     */
    ENABLE(1, "启用"),

    /**
     * 删除
     */
    DELETE(-1, "删除"),
    ;

    public final int code;
    public final String desc;

    StatusEnum(int code, String desc) {

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
