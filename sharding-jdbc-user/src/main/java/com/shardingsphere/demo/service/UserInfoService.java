package com.shardingsphere.demo.service;

import com.shardingsphere.demo.mapper.UserInfoMapper;
import com.shardingsphere.demo.mapper.entity.UserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: shaominghui
 * @Date: 2022/2/6 23:47
 */
@Service
public class UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public void insert(UserInfoEntity userInfoEntity) {
        userInfoMapper.insert(userInfoEntity);
    }

}
