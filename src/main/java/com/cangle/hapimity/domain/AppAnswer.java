package com.cangle.hapimity.domain;

import java.util.Date;

/**
 * @author raorui
 */
public class AppAnswer {
    /**
     * 回答ID
     */
    private String id;
    /**
     * 回答正文
     */
    private String answer;
    /**
     * 回答获得点赞数
     */
    private Integer stars;
    /**
     * 回答人id
     */
    private String userId;
    /**
     * 回答问题的id
     */
    private String questionId;
    /**
     * 回答状态：{1：启用，0：禁用，-1：删除}
     */
    private Integer status;
    /**
     * 回答创建时间
     */
    private Date gmtCreate;
    /**
     * 回答更新时间
     */
    private Date gmtUpdate;

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }
}