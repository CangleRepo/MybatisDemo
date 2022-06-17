package com.cangle.common.exception;

import com.cangle.common.constant.ResponseEnum;

import java.util.List;

/**
 * @author raorui
 * @date 2022/6/17 14:42
 */
public class ServiceException extends Exception {
    private ResponseEnum responseEnum;

    private List<String> messages;

    public ServiceException(ResponseEnum responseEnum) {
        this.responseEnum = responseEnum;
    }

    public ServiceException(ResponseEnum responseEnum,List<String> messages) {
        this.responseEnum = responseEnum;
        this.messages = messages;
    }

    public ServiceException(String message) {
        super(message);
    }

    public ResponseEnum getResponseEnum() {
        return responseEnum;
    }

    public void setResponseEnum(ResponseEnum responseEnum) {
        this.responseEnum = responseEnum;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
