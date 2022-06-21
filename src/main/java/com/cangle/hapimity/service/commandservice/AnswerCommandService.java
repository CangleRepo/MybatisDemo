package com.cangle.hapimity.service.commandservice;

import com.cangle.common.exception.ServiceException;
import com.cangle.hapimity.model.application.answer.AnswerRequest;

/**
 * @author raorui
 * @date 2022/6/21 16:19
 */
public interface AnswerCommandService {
    /**
     * 增加回答
     * @param request
     * @throws ServiceException
     */
    void addAnswer(AnswerRequest request) throws ServiceException;
}
