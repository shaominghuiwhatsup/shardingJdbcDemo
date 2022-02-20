package com.shardingsphere.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.shardingsphere.demo.mapper.entity.ClassEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClassMapper extends BaseMapper<ClassEntity> {
}
