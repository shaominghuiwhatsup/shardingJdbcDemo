package com.shardingsphere.demo.service;

import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.shardingsphere.demo.mapper.UserInfoMapper;
import com.shardingsphere.demo.mapper.entity.UserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: shaominghui
 * @Date: 2022/2/6 23:47
 */
@Service
public class UserInfoService extends ServiceImpl<UserInfoMapper,UserInfoEntity> {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfoEntity> queryList() {
        return userInfoMapper.queryList();
    }
}
