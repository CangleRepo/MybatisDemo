package com.cangle.hapimity.service.commandservice.impl;

import com.cangle.common.constant.ResponseEnum;
import com.cangle.common.constant.StatusEnum;
import com.cangle.common.exception.ServiceException;
import com.cangle.hapimity.dao.AppAnswerMapper;
import com.cangle.hapimity.domain.AppAnswer;
import com.cangle.hapimity.domain.AppQuestion;
import com.cangle.hapimity.model.application.answer.AnswerRequest;
import com.cangle.hapimity.service.commandservice.AnswerCommandService;
import com.cangle.hapimity.utils.ShortCodeGenerator;
import com.cangle.hapimity.utils.SpringBeanUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author raorui
 * @date 2022/6/21 16:19
 */
@Service
public class AnswerCommandServiceImpl implements AnswerCommandService {
    @Resource
    private AppAnswerMapper appAnswerMapper;

    @Override
    public void addAnswer(AnswerRequest request) throws ServiceException {
        if (!ObjectUtils.isEmpty(request)){
            AppAnswer addAnswer = new AppAnswer();
            BeanUtils.copyProperties(request,addAnswer);
            ShortCodeGenerator shortCodeGenerator = SpringBeanUtils.getBean(ShortCodeGenerator.class);
            addAnswer.setId(shortCodeGenerator.createId());
            addAnswer.setStars(0);
            addAnswer.setStatus(StatusEnum.ENABLE.code);
            addAnswer.setGmtCreate(new Date());
            addAnswer.setGmtUpdate(new Date());
            appAnswerMapper.insert(addAnswer);
        }
        else {
            throw new ServiceException(ResponseEnum.QUESTION_IS_NULL);
        }
    }
}
