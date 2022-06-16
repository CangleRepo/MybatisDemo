package com.cangle.hapimity.domain;

/**
 * @author raorui
 * @date 2022/6/16 14:17
 */
public class AppUserDO {

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
     * 系统用户邮箱号码
     */
    private String email;
    /**
     * 系统用户状态：{1：启用，0：禁用，-1：删除}
     */
    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AppUserDO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                '}';
    }
}
