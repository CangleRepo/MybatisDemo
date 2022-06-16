package com.cangle.hapimity.dao;

import com.cangle.hapimity.domain.AppUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author raorui
 */
@Repository
@Mapper
public interface AppUserMapper {
    int deleteByPrimaryKey(String id);

    void insert(AppUser record);

    AppUser selectByPrimaryKey(String id);

    List<AppUser> selectAll();

    int updateByPrimaryKey(AppUser record);
}