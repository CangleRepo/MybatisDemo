package com.cangle.hapimity.domain;

import java.util.Date;

/**
 * @author raorui
 */
public class AppQuestion {
    /**
     * 问题ID
     */
    private String id;
    /**
     * 问题的标题（摘要）
     */
    private String questionTitle;
    /**
     * 问题正文
     */
    private String question;
    /**
     * 获得点赞
     */
    private Integer stars;
    /**
     * 提问人ID
     */
    private String userId;
    /**
     * 问题状态：{1：启用，0：禁用，-1：删除}
     */
    private Integer status;
    /**
     * 问题创建时间
     */
    private Date gmtCreate;
    /**
     * 问题更新时间
     */
    private Date gmtUpdate;

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

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle == null ? null : questionTitle.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
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