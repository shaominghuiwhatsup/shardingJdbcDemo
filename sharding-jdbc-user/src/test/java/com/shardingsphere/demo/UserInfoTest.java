package com.shardingsphere.demo;

import com.shardingsphere.demo.mapper.entity.UserInfoEntity;
import com.shardingsphere.demo.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: shaominghui
 * @Date: 2022/2/19 13:54
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserInfoTest {
    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void test() {
        for (int i = 0;i<10;i++) {
            UserInfoEntity entity = new UserInfoEntity();
            entity.setAddr("addr:"+ i);
            entity.setPhone("138000000"+i);
            userInfoService.insert(entity);
        }
    }
}
