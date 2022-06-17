package com.cangle.common.constant;

/**
 * @author raorui
 * @date 2022/6/16 14:50
 */
public enum ResponseEnum {
    /**
     * 状态枚举：状态码，状态信息
     */
    SUCCESS(1,"成功"),
    FAILURE(0, "失败"),
    QUESTION_IS_NULL(100, "问题不能为空"),
    USER_IS_EXIT(101, "姓名已存在");

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
