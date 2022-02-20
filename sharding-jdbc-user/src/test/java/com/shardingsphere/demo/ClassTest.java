package com.shardingsphere.demo;

import com.shardingsphere.demo.mapper.ClassMapper;
import com.shardingsphere.demo.mapper.entity.ClassEntity;
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
public class ClassTest {
    @Autowired
    private ClassMapper classMapper;

    @Test
    public void insert() {
        for (int i = 0;i<20;i++) {
            ClassEntity entity = new ClassEntity();
            entity.setCname("class"+i);
            entity.setCid(i);
            classMapper.insert(entity);
        }
    }
}
