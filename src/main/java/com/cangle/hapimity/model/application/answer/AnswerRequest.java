package com.cangle.hapimity.model.application.answer;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author raorui
 * @date 2022/6/21 16:17
 */
@Schema(name = "AnswerRequest",description="添加回答model")
public class AnswerRequest {
    @Schema(name = "answer",description="回答正文")
    @NotBlank
    @Size(max = 255)
    private String answer;

    @Schema(name = "userId",description="回答人id")
    @NotBlank
    @Size(max = 36)
    private String userId;

    @Schema(name = "questionId",description="回答问题id")
    @NotBlank
    @Size(max = 36)
    private String questionId;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }
}
