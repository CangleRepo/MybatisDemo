package com.cangle.hapimity.service.queryservice.impl;

import com.cangle.common.response.BasePageResponse;
import com.cangle.hapimity.dao.AppQuestionMapper;
import com.cangle.hapimity.domain.AppQuestion;
import com.cangle.hapimity.model.application.question.QueryQuestionPageRequest;
import com.cangle.hapimity.model.application.question.QueryQuestionPageResponse;
import com.cangle.hapimity.service.queryservice.QuestionQueryService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author raorui
 * @date 2022/6/17 15:30
 */
@Service
public class QuestionQueryServiceImpl implements QuestionQueryService {
    @Resource
    private AppQuestionMapper appQuestionMapper;

    @Override
    public BasePageResponse<List<QueryQuestionPageResponse>> queryQuestionPage(QueryQuestionPageRequest request) {
        PageHelper.startPage(request.getPageIndex(), request.getPageSize());
        Page<QueryQuestionPageResponse> page = appQuestionMapper.selectPageByIdOrKeywords(request);
        BasePageResponse<List<QueryQuestionPageResponse>> pageResponse = new BasePageResponse<>();
        if (!ObjectUtils.isEmpty(page)){
            BeanUtils.copyProperties(page, pageResponse);
            pageResponse.setContent(page.getResult());
            pageResponse.setTotalPages(page.getPages());
            return pageResponse;
        }
        return null;
    }
}
