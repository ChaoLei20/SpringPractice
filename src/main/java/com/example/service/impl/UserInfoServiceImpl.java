package com.example.service.impl;

import com.example.dao.UserInfoMapper;
import com.example.entity.UserInfoEntity;
import com.example.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author May
 * <p>
 * 业务接口的具体实现
 */
@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    /**
     * 查询所有用户
     *
     * @return 返回所有用户数据
     */
    @Override
    public List<UserInfoEntity> findAll() {
        return userInfoMapper.findAllUserInfo();
    }
}
