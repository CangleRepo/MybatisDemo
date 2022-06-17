package com.cangle.hapimity.service.queryservice.impl;

import com.cangle.hapimity.dao.AppUserMapper;
import com.cangle.hapimity.domain.AppUser;
import com.cangle.hapimity.service.queryservice.UserQueryService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;

/**
 * @author raorui
 * @date 2022/6/16 14:42
 */
@Service
public class UserQueryServiceImpl implements UserQueryService {
    @Resource
    private AppUserMapper appUserMapper;

    @Override
    public AppUser queryAppUserById(String id) {
        AppUser appUser = appUserMapper.selectById(id);
        if (!ObjectUtils.isEmpty(appUser)){
            return appUser;
        }
        return null;
    }
}
