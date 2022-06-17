package com.cangle.hapimity.dao;

import com.cangle.hapimity.domain.AppAnswer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author raorui
 */
@Repository
@Mapper
public interface AppAnswerMapper {
    int deleteByPrimaryKey(String id);

    int insert(AppAnswer record);

    AppAnswer selectByPrimaryKey(String id);

    List<AppAnswer> selectAll();

    int updateByPrimaryKey(AppAnswer record);
}