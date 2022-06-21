package com.cangle.hapimity.domain;

/**
 * @author raorui
 */
public class AppUser {
    /**
     * 系统用户ID
     */
    private String id;
    /**
     * 系统用户昵称
     */
    private String name;
    /**
     * 系统用户密码
     */
    private String password;
    /**
     * 系统用户头像
     */
    private String avatar;
    /**
     * 系统用户邮箱号码
     */
    private String email;
    /**
     * 等级分
     */
    private String rank;
    /**
     * 系统用户状态：{1：启用，0：禁用，-1：删除}
     */
    private Integer status;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}