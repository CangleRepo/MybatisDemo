package com.cangle.hapimity.controller.application;

import com.cangle.common.exception.ServiceException;
import com.cangle.common.response.BasePageResponse;
import com.cangle.common.response.BaseResponse;
import com.cangle.common.response.ResponseUtils;
import com.cangle.hapimity.domain.AppQuestion;
import com.cangle.hapimity.model.application.question.PublishQuestionRequest;
import com.cangle.hapimity.model.application.question.QueryQuestionPageRequest;
import com.cangle.hapimity.model.application.question.QueryQuestionPageResponse;
import com.cangle.hapimity.service.commandservice.QuestionCommandService;
import com.cangle.hapimity.service.queryservice.QuestionQueryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author raorui
 * @date 2022/6/17 14:10
 */
@Tag(name = "PublicController", description = "应用广场")
@RequestMapping(value ="/hapimity/public")
@RestController
public class PublicController {
    @Resource
    private QuestionCommandService questionCommandService;

    @Resource
    private QuestionQueryService questionQueryService;

    @Operation(summary = "发布问题")
    @PostMapping(value = "/publishQuestion")
    public BaseResponse<Void> publishQuestion(@RequestBody @Validated PublishQuestionRequest request) throws ServiceException {
        questionCommandService.publishQuestion(request);
        return ResponseUtils.getSuccessResponse(null);
    }

    @Operation(summary = "删除问题")
    @PostMapping(value = "/deleteQuestion")
    public BaseResponse<Void> deleteQuestion(@RequestParam(value = "id") String id) throws ServiceException {
        questionCommandService.deleteQuestionById(id);
        return ResponseUtils.getSuccessResponse(null);
    }

    @Operation(summary = "分页查询问题")
    @PostMapping(value = "/queryQuestionPage")
    public BaseResponse<BasePageResponse<List<QueryQuestionPageResponse>>> queryQuestionPage(@RequestBody @Validated QueryQuestionPageRequest request){
        return ResponseUtils.getSuccessResponse(questionQueryService.queryQuestionPage(request));
    }
}
