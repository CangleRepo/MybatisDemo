package com.cangle.hapimity.model.application.user;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author raorui
 * @date 2022/6/17 13:35
 */
@Schema(name = "EditAppUserRequest",description="应用编辑用户")
public class EditAppUserRequest{
    @Schema(name = "id",description = "应用用户id")
    @NotBlank
    @Size(max = 36)
    private String id;

    @Schema(name = "name",description="用户昵称")
    @NotBlank
    @Size(max = 50)
    private String name;

    @Schema(name = "password",description="用户密码")
    @NotBlank
    @Size(max = 50)
    private String password;

    @Schema(name = "email",description="用户邮箱号")
    @NotBlank
    @Size(max = 50)
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
