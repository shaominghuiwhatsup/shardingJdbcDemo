package com.shardingsphere.demo.controller;

import com.shardingsphere.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: shaominghui
 * @Date: 2022/2/6 23:49
 */
@RestController
@RequestMapping("userinfo")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;


}
