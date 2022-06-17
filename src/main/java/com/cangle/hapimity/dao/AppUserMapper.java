package com.cangle.hapimity.dao;

import com.cangle.hapimity.domain.AppUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author raorui
 */
@Repository
@Mapper
public interface AppUserMapper {
    int deleteById(String id);

    /**
     * 新增一条user记录
     * @param record
     */
    void insert(AppUser record);

    /**
     * 通过userId查询user记录
     * @param id
     * @return
     */
    AppUser selectById(@Param("id") String id);

    List<AppUser> selectAll();

    /**
     * 根据userId更新user记录
     * @param record
     */
    void updateById(AppUser record);

    /**
     * 根据userName查询user记录
     * @param userName
     * @return
     */
    AppUser selectByName(String userName);
}