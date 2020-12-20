package com.example.service;

import com.example.entity.UserInfoEntity;

import java.util.List;

/**
 * @author May
 * <p>
 * Service是针对业务实现的接口，DAO是针对数据库的
 */
public interface UserInfoService {

    /**
     * 查询所有用户
     *
     * @return 返回所有用户数据
     */
    List<UserInfoEntity> findAll();
}
