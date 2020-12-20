package com.example.dao;

import com.example.entity.UserInfoEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class UserInfoMapperTest {

    @Resource
    private UserInfoMapper userInfoMapper;

    /**
     * 查询单个用户
     */
    @Test
    void findOnlyUserInfo() {
        log.info("---> find only user info: {}", userInfoMapper.findOnlyUserInfo("1"));
    }

    /**
     * 查询所有用户
     */
    @Test
    void findAllUserInfo() {
        log.info("---> find all user info: {}", userInfoMapper.findAllUserInfo());
    }

    /**
     * 插入用户信息
     */
    @Test
    void insertUserInfo() {
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        userInfoEntity.setId("1234");
        userInfoEntity.setName("姓名2");
        userInfoEntity.setAge(24);
        userInfoEntity.setAddress(1606);
        int status = userInfoMapper.insertUserInfo(userInfoEntity);
        if (status == 1) {
            log.info("---> insert user info was successfully: {}", status);
        } else {
            log.info("---> insert user info was error: {}", status);
        }
    }

    /**
     * 更新用户信息
     */
    @Test
    void updateUserInfo() {
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        // ID保持不变
        userInfoEntity.setId("123");
        userInfoEntity.setName("姓名1");
        userInfoEntity.setAge(24);
        userInfoEntity.setAddress(1606);
        int status = userInfoMapper.updateUserInfo(userInfoEntity);
        if (status == 1) {
            log.info("---> update user info was successfully: {}", status);
        } else {
            log.info("---> update user info was error: {}", status);
        }
    }

    /**
     * 根据全局唯一ID来删除用户信息
     */
    @Test
    void deleteUserInfo() {
        int i = userInfoMapper.deleteUserInfo("123");
        if (i == 1) {
            log.info("---> delete user info was successfully: {}", i);
        } else {
            log.info("---> delete user info was error: {}", i);
        }
    }
}
