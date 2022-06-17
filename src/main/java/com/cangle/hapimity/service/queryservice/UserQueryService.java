package com.cangle.hapimity.service.queryservice;

import com.cangle.hapimity.domain.AppUser;

/**
 * @author raorui
 * @date 2022/6/16 14:41
 */
public interface UserQueryService {
    /**
     * 通过用户ID查询用户
     * @param id
     * @return
     */
    AppUser queryAppUserById(String id);
}
