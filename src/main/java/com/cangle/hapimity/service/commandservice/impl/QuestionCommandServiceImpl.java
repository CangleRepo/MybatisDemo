package com.cangle.hapimity.service.commandservice.impl;

import com.cangle.common.constant.ResponseEnum;
import com.cangle.common.constant.StatusEnum;
import com.cangle.common.exception.ServiceException;
import com.cangle.hapimity.dao.AppQuestionMapper;
import com.cangle.hapimity.domain.AppQuestion;
import com.cangle.hapimity.model.application.question.EditQuestionRequest;
import com.cangle.hapimity.model.application.question.PublishQuestionRequest;
import com.cangle.hapimity.service.commandservice.QuestionCommandService;
import com.cangle.hapimity.utils.ShortCodeGenerator;
import com.cangle.hapimity.utils.SpringBeanUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author raorui
 * @date 2022/6/17 14:29
 */
@Service
public class QuestionCommandServiceImpl implements QuestionCommandService {
    @Resource
    private AppQuestionMapper appQuestionMapper;

    @Override
    public void publishQuestion(PublishQuestionRequest request) throws ServiceException {
        if (!ObjectUtils.isEmpty(request)){
            AppQuestion appQuestion = new AppQuestion();
            BeanUtils.copyProperties(request,appQuestion);
            ShortCodeGenerator shortCodeGenerator = SpringBeanUtils.getBean(ShortCodeGenerator.class);
            appQuestion.setId(shortCodeGenerator.createId());
            appQuestion.setStars(0);
            appQuestion.setStatus(StatusEnum.ENABLE.code);
            appQuestion.setGmtCreate(new Date());
            appQuestion.setGmtUpdate(new Date());
            appQuestionMapper.insert(appQuestion);
        }
        else {
            throw new ServiceException(ResponseEnum.QUESTION_IS_NULL);
        }
    }

    @Override
    public void deleteQuestionById(String id) {
        AppQuestion appQuestion = appQuestionMapper.selectById(id);
        if (!ObjectUtils.isEmpty(appQuestion)){
            appQuestion.setGmtUpdate(new Date());
            appQuestion.setStatus(StatusEnum.DELETE.code);
            appQuestionMapper.updateById(appQuestion);
        }
    }

    @Override
    public void editQuestion(EditQuestionRequest request) throws ServiceException {
        AppQuestion appQuestion = appQuestionMapper.selectById(request.getId());
        if (!ObjectUtils.isEmpty(appQuestion)){
            BeanUtils.copyProperties(request,appQuestion);
            appQuestion.setGmtUpdate(new Date());
            appQuestionMapper.insert(appQuestion);
        }
        else {
            throw new ServiceException(ResponseEnum.QUESTION_IS_NULL);
        }
    }
}
