package com.cangle.hapimity.service.commandservice.impl;

import com.cangle.common.constant.ResponseEnum;
import com.cangle.common.constant.StatusEnum;
import com.cangle.common.exception.ServiceException;
import com.cangle.hapimity.dao.AppUserMapper;
import com.cangle.hapimity.domain.AppUser;
import com.cangle.hapimity.model.application.user.AddAppUserRequest;
import com.cangle.hapimity.model.application.user.EditAppUserRequest;
import com.cangle.hapimity.service.commandservice.UserCommandService;
import com.cangle.hapimity.service.queryservice.UserQueryService;
import com.cangle.hapimity.service.queryservice.impl.UserQueryServiceImpl;
import com.cangle.hapimity.utils.ShortCodeGenerator;
import com.cangle.hapimity.utils.SpringBeanUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;

/**
 * @author raorui
 * @date 2022/6/16 14:42
 */
@Service
public class UserCommandServiceImpl implements UserCommandService {
    @Resource
    private AppUserMapper appUserMapper;

    @Resource
    private UserQueryService userQueryService;

    @Override
    public void addAppUser(AddAppUserRequest request) throws ServiceException {
        if (checkUserNameUnique(request.getName())){
            AppUser appUser = new AppUser();
            BeanUtils.copyProperties(request,appUser);
            ShortCodeGenerator shortCodeGenerator = SpringBeanUtils.getBean(ShortCodeGenerator.class);
            appUser.setId(shortCodeGenerator.createId());
            appUser.setStatus(StatusEnum.ENABLE.code);
            appUser.setRank("0");
            appUserMapper.insert(appUser);
        }
        else{
            throw new ServiceException(ResponseEnum.USER_IS_EXIT);
        }
    }

    @Override
    public void removeAppUser(String id) {
        AppUser appUser = appUserMapper.selectById(id);
        if (!ObjectUtils.isEmpty(appUser)) {
            appUser.setStatus(StatusEnum.DELETE.code);
            appUserMapper.updateById(appUser);
        }
    }

    @Override
    public void editAppUser(EditAppUserRequest request) {
        if (!ObjectUtils.isEmpty(request)){
            AppUser appUser = userQueryService.queryAppUserById(request.getId());
            BeanUtils.copyProperties(request,appUser);
            appUserMapper.updateById(appUser);
        }
    }

    public Boolean checkUserNameUnique(String userName){
        AppUser appUser = appUserMapper.selectByName(userName);
        return ObjectUtils.isEmpty(appUser);
    }
}
