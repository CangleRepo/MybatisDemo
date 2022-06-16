package com.cangle.hapimity.service.commandservice.impl;

import com.cangle.common.constant.StatusEnum;
import com.cangle.hapimity.dao.AppUserMapper;
import com.cangle.hapimity.domain.AppUser;
import com.cangle.hapimity.domain.AppUserDO;
import com.cangle.hapimity.model.application.AddAppUserRequest;
import com.cangle.hapimity.service.commandservice.UserCommandService;
import com.cangle.hapimity.utils.ShortCodeGenerator;
import com.cangle.hapimity.utils.SpringBeanUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author raorui
 * @date 2022/6/16 14:42
 */
@Service
public class UserCommandServiceImpl implements UserCommandService {

    @Resource
    private AppUserMapper appUserMapper;

    @Override
    public void addAppUser(AddAppUserRequest request) {
        AppUser appUser = new AppUser();
        BeanUtils.copyProperties(request,appUser);
        ShortCodeGenerator shortCodeGenerator = SpringBeanUtils.getBean(ShortCodeGenerator.class);
        appUser.setId(shortCodeGenerator.createId());
        appUser.setStatus(StatusEnum.ENABLE.code);
        appUserMapper.insert(appUser);
    }
}
