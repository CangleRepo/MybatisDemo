package com.cangle.hapimity.service.commandservice;

import com.cangle.hapimity.model.application.AddAppUserRequest;

/**
 * @author raorui
 * @date 2022/6/16 14:41
 */
public interface UserCommandService {
    /**
     * 应用新增用户
     * @param request
     */
    void addAppUser(AddAppUserRequest request);
}
