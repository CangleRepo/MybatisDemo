package com.cangle.hapimity.dao;

import com.cangle.hapimity.domain.AppUser;
import java.util.List;

public interface AppUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(AppUser record);

    AppUser selectByPrimaryKey(String id);

    List<AppUser> selectAll();

    int updateByPrimaryKey(AppUser record);
}