package com.cangle.hapimity.model.application.question;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author raorui
 * @date 2022/6/21 16:08
 */
@Schema(name = "EditQuestionRequest",description="编辑问题model")
public class EditQuestionRequest {
    @Schema(name = "id",description="问题id")
    @NotBlank
    @Size(max = 36)
    private String id;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}
