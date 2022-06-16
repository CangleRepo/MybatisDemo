package com.cangle.common.response;

/**
 * @author raorui
 * @date 2022/6/16 14:46
 */
public class BaseResponse<T> {

    private Integer code;

    private String desc;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BaseResponse() {
    }

    public BaseResponse(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public BaseResponse(Integer code, String desc, T data) {
        this.code = code;
        this.desc = desc;
        this.data = data;
    }
}
