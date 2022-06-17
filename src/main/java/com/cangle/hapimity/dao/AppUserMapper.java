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
    int deleteById(String id);

    void insert(AppUser record);

    AppUser selectById(String id);

    List<AppUser> selectAll();

    int updateById(AppUser record);
}