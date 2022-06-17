package com.cangle.hapimity.model.application.question;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @author raorui
 * @date 2022/6/17 14:14
 */
@Schema(name = "PublishQuestionRequest",description = "发布问题model")
public class PublishQuestionRequest {
    @Schema(name = "questionTitle",description = "问题标题")
    @NotBlank
    @Size(max =50)
    private String questionTitle;

    @Schema(name = "question",description = "问题正文")
    @NotBlank
    @Size(max =255)
    private String question;

    @Schema(name = "userId",description = "提问人ID")
    @NotBlank
    @Size(max =255)
    private String userId;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}
