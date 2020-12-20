package com.example.entity;

import lombok.Data;

@Data
public class UserInfoEntity {

    /**
     * ID 表明全表唯一标识，防止重复
     */
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 地址
     */
    private int address;
}
