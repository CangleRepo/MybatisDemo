package com.cangle.hapimity.model.application.user;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author raorui
 * @date 2022/6/17 13:35
 */
@Schema(name = "EditAppUserRequest",description="应用编辑用户")
public class EditAppUserRequest extends AddAppUserRequest{

    @Schema(name = "id",description = "应用用户id")
    @NotBlank
    @Size(max = 36)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
