package com.cangle.hapimity.domain;

public class AppQa {
    private String id;

    private String appQuestionId;

    private String appAnswerId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAppQuestionId() {
        return appQuestionId;
    }

    public void setAppQuestionId(String appQuestionId) {
        this.appQuestionId = appQuestionId == null ? null : appQuestionId.trim();
    }

    public String getAppAnswerId() {
        return appAnswerId;
    }

    public void setAppAnswerId(String appAnswerId) {
        this.appAnswerId = appAnswerId == null ? null : appAnswerId.trim();
    }
}