package com.shardingsphere.demo.algorithm;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.util.Arrays;
import java.util.Collection;

/**
 * @Author: shaominghui
 * @Date: 2022/2/20 17:01
 */
public class MyPreciseAlgorithm implements PreciseShardingAlgorithm<Integer> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Integer> preciseShardingValue) {
        String logicTableName = preciseShardingValue.getLogicTableName();
        Integer value = preciseShardingValue.getValue();

        // 每个表十条数据
        long index = (value - 1)/10 + 1;
        return logicTableName + "_" + index;
    }
}
