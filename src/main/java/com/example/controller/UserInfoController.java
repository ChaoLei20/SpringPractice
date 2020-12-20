package com.example.controller;

import com.example.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author May
 * <p>
 * 对外暴露用户信息相关接口
 */
@RestController
@RequestMapping(value = "/")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @GetMapping(value = "/all")
    public Object findAll() {
        return userInfoService.findAll();
    }
}
