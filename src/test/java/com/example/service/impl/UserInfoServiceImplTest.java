package com.example.service.impl;

import com.example.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author May
 *
 * 测试Service层
 */
@SpringBootTest
@Slf4j
class UserInfoServiceImplTest {

    @Resource
    private UserInfoService userInfoService;

    @Test
    void findAll() {
        log.info("---> service: {}", userInfoService.findAll());
    }
}
