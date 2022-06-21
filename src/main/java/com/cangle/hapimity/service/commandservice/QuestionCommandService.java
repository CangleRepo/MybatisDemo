package com.cangle.hapimity.service.commandservice;

import com.cangle.common.exception.ServiceException;
import com.cangle.hapimity.model.application.question.EditQuestionRequest;
import com.cangle.hapimity.model.application.question.PublishQuestionRequest;
import org.springframework.stereotype.Service;

/**
 * @author raorui
 * @date 2022/6/17 14:29
 */
public interface QuestionCommandService {
    /**
     * 发布问题
     * @param request
     * @throws ServiceException
     */
    void publishQuestion(PublishQuestionRequest request) throws ServiceException;

    /**
     * 删除问题
     * @param id
     */
    void deleteQuestionById(String id);

    /**
     * 编辑问题
     * @param request
     * @throws ServiceException
     */
    void editQuestion(EditQuestionRequest request) throws ServiceException;
}
