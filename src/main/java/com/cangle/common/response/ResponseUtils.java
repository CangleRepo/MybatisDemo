package com.cangle.common.response;

import com.cangle.common.constant.ResponseEnum;

/**
 * @author raorui
 * @date 2022/6/16 14:50
 */
public class ResponseUtils {
    public static BaseResponse getResponseCode(ResponseEnum result) {
        return new BaseResponse(result.getCode(), result.getDesc());
    }

    public static BaseResponse getResponseCode(int code,String desc) {
        return new BaseResponse(code, desc);
    }

    public static BaseResponse getParamErrorResponse(String paraName) {
        return new BaseResponse(ResponseEnum.FAILURE.getCode(), paraName);
    }

    public static BaseResponse getSuccessResponse() {
        return new BaseResponse(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getDesc());
    }

    public static <T> BaseResponse<T> getSuccessResponse(T data) {
        return new BaseResponse<T>(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getDesc(), data);
    }

    public static <T> BaseResponse<T> getResponseCode(ResponseEnum result, T data) {
        return new BaseResponse(result.getCode(), result.getDesc(), data);
    }

    public static BaseResponse getErrorResponse() {
        return new BaseResponse(ResponseEnum.FAILURE.getCode(), ResponseEnum.FAILURE.getDesc());
    }

    public static BaseResponse getErrorResponse(Integer code, String message) {
        return new BaseResponse(code, message);
    }
}
