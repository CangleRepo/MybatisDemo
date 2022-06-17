package com.cangle.hapimity.dao;

import com.cangle.hapimity.domain.AppQuestion;
import com.cangle.hapimity.model.application.question.QueryQuestionPageRequest;
import com.cangle.hapimity.model.application.question.QueryQuestionPageResponse;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author raorui
 */
@Repository
@Mapper
public interface AppQuestionMapper {
    int deleteByPrimaryKey(String id);

    /**
     * 插入一条问题记录
     * @param record
     * @return
     */
    int insert(AppQuestion record);

    AppQuestion selectByPrimaryKey(String id);

    List<AppQuestion> selectAll();

    int updateByPrimaryKey(AppQuestion record);

    Page<QueryQuestionPageResponse> selectPageByIdOrKeywords(QueryQuestionPageRequest request);
}