package com.cangle.hapimity.model.application.question;

import com.cangle.hapimity.model.basic.PageRequest;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author raorui
 * @date 2022/6/17 15:17
 */
@Schema(name = "QueryQuestionPageRequest", description = "问题分页查询")
public class QueryQuestionPageRequest extends PageRequest implements Serializable {
    @Schema(name = "id",description = "问题ID")
    @Size(max = 36)
    private String id;

    @Schema(name = "keywords",description = "关键词")
    @Size(max = 100)
    private String keywords;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
