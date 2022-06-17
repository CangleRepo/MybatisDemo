package com.cangle.hapimity.service.commandservice;

import com.cangle.common.exception.ServiceException;
import com.cangle.hapimity.domain.AppUser;
import com.cangle.hapimity.model.application.user.AddAppUserRequest;
import com.cangle.hapimity.model.application.user.EditAppUserRequest;

/**
 * @author raorui
 * @date 2022/6/16 14:41
 */
public interface UserCommandService {
    /**
     * 应用新增用户
     * @param request
     */
    void addAppUser(AddAppUserRequest request) throws ServiceException;

    /**
     * 应用删除用户
     * @param id
     */
    void removeAppUser(String id);

    /**
     * 应用编辑用户
     * @param request
     */
    void editAppUser(EditAppUserRequest request);
}
