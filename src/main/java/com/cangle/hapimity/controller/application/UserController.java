package com.cangle.hapimity.controller.application;

import com.cangle.common.response.BaseResponse;
import com.cangle.common.response.ResponseUtils;
import com.cangle.hapimity.model.application.AddAppUserRequest;
import com.cangle.hapimity.service.commandservice.UserCommandService;
import com.cangle.hapimity.service.queryservice.UserQueryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public BaseResponse<Void> addAppUser(@RequestBody @Validated AddAppUserRequest request){
        userCommandService.addAppUser(request);
        return ResponseUtils.getSuccessResponse(null);
    }
}
