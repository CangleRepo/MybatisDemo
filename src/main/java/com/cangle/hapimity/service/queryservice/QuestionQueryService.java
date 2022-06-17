package com.cangle.hapimity.service.queryservice;

import com.cangle.common.response.BasePageResponse;
import com.cangle.hapimity.domain.AppQuestion;
import com.cangle.hapimity.model.application.question.QueryQuestionPageRequest;
import com.cangle.hapimity.model.application.question.QueryQuestionPageResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author raorui
 * @date 2022/6/17 15:29
 */

public interface QuestionQueryService {
    /**
     * 分页查询问题
     * @param request
     * @return
     */
    BasePageResponse<List<QueryQuestionPageResponse>> queryQuestionPage(QueryQuestionPageRequest request);
}
