package com.cangle.hapimity.service.commandservice;

import com.cangle.hapimity.model.application.AddAppUserRequest;

/**
 * @author raorui
 * @date 2022/6/16 14:41
 */
public interface UserCommandService {
    void addAppUser(AddAppUserRequest request);
}
