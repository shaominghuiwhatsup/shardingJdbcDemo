package com.shardingsphere.demo.mapper;

import com.shardingsphere.demo.mapper.entity.UserInfoEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoMapper {
    void insert(UserInfoEntity entity);
}
