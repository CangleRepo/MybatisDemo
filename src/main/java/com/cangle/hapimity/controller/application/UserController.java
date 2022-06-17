package com.cangle.hapimity.controller.application;

import com.cangle.common.exception.ServiceException;
import com.cangle.common.response.BaseResponse;
import com.cangle.common.response.ResponseUtils;
import com.cangle.hapimity.domain.AppUser;
import com.cangle.hapimity.model.application.user.AddAppUserRequest;
import com.cangle.hapimity.model.application.user.EditAppUserRequest;
import com.cangle.hapimity.service.commandservice.UserCommandService;
import com.cangle.hapimity.service.queryservice.UserQueryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author raorui
 * @date 2022/6/16 14:29
 */
@Tag(name = "UserController", description = "应用用户管理")
@RequestMapping(value ="/hapimity/app")
@RestController
public class UserController {
    @Resource
    private UserQueryService userQueryService;

    @Resource
    private UserCommandService userCommandService;

    @Operation(summary = "新增应用用户")
    @PostMapping(value ="/addAppUser")
    public BaseResponse<Void> addAppUser(@RequestBody @Validated AddAppUserRequest request) throws ServiceException {
        userCommandService.addAppUser(request);
        return ResponseUtils.getSuccessResponse(null);
    }

    @Operation(summary = "删除应用用户")
    @PostMapping(value ="/removeAppUser")
    public BaseResponse<Void> removeAppUser(@RequestParam(value = "id") String id){
        userCommandService.removeAppUser(id);
        return ResponseUtils.getSuccessResponse(null);
    }

    @Operation(summary = "编辑应用用户")
    @PostMapping(value ="/editAppUser")
    public BaseResponse<Void> editAppUser(@RequestBody @Validated EditAppUserRequest request){
        userCommandService.editAppUser(request);
        return ResponseUtils.getSuccessResponse(null);
    }

    @Operation(summary = "查询应用用户")
    @PostMapping(value ="/queryAppUser")
    public BaseResponse<AppUser> queryAppUserById(@RequestParam(value = "id") String id){
        return ResponseUtils.getSuccessResponse(userQueryService.queryAppUserById(id));
    }
}
