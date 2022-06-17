package com.cangle.hapimity.dao;

import com.cangle.hapimity.domain.AppQa;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author raorui
 */
@Repository
@Mapper
public interface AppQaMapper {
    int deleteByPrimaryKey(String id);

    int insert(AppQa record);

    AppQa selectByPrimaryKey(String id);

    List<AppQa> selectAll();

    int updateByPrimaryKey(AppQa record);
}