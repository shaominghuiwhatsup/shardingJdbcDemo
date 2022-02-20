package com.shardingsphere.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.shardingsphere.demo.mapper.entity.UserInfoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoMapper extends BaseMapper<UserInfoEntity> {
    List<UserInfoEntity> queryList();
}
