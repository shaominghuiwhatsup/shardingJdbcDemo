package com.shardingsphere.demo.mapper.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @Author: shaominghui
 * @Date: 2022/2/20 17:15
 */
@TableName("t_class")
@Data
public class ClassEntity {
    @TableId
    private Long sid;
    @TableField("cname")
    private String cname;

    @TableField("cid")
    private Integer cid;
}
