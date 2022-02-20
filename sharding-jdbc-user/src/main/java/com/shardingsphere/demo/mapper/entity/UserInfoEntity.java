package com.shardingsphere.demo.mapper.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @Author: shaominghui
 * @Date: 2022/2/6 23:45
 */
@Data
@TableName("user_info")
public class UserInfoEntity {
    private Long id;

    private String phone;

    private String addr;
}
