package com.shardingsphere.demo.algorithm;

import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.util.Arrays;
import java.util.Collection;

/**
 * @Author: shaominghui
 * @Date: 2022/2/20 17:01
 */
public class MyRangeAlgorithm implements RangeShardingAlgorithm<Integer> {
    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<Integer> rangeShardingValue) {
        System.out.println(rangeShardingValue.getColumnName());
        String logicTableName = rangeShardingValue.getLogicTableName();
        Integer lower = rangeShardingValue.getValueRange().lowerEndpoint();
        Integer upper = rangeShardingValue.getValueRange().upperEndpoint();

        // 1-10到第一张表，11-20到第二张表。。
        Integer lowerTableIndex = (lower-1)/10 + 1;
        Integer upTableIndex = (upper-1)/10 + 1;

        return Arrays.asList(logicTableName + "_" + lowerTableIndex, logicTableName + "_" + upTableIndex);
    }
}
