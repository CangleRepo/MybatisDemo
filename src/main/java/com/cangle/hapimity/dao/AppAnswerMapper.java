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
    int deleteById(String id);

    int insert(AppAnswer record);

    AppAnswer selectById(String id);

    List<AppAnswer> selectAll();

    int updateById(AppAnswer record);
}