2022-2-19 15:25
> - 创建工程，用于测试shardingsphere
> - 采用mybatis框架，shardingjdbc采用shardingsphere默认提供的算法进行分片计算
> - 主键id默认采用雪花算法，分片字段为id，不分库，只分表，表名：user_info, 共分三个表
> - 配置如下：
```yaml
spring:
    application:
      name: shardingjdbc-user
    cloud:
      nacos:
        server-addr: localhost:8848
    shardingsphere:
      datasource:
        names: shardingjdbc0
        shardingjdbc0:
          type: com.alibaba.druid.pool.DruidDataSource
          driver-class-name: com.mysql.cj.jdbc.Driver
          url: jdbc:mysql://localhost:3306/shardingjdbc0?serverTimezone=GMT%2B8
          username: root
          password: shao0526
        #分表策略
      sharding:
        tables:
         user_info:
          actual-data-nodes: shardingjdbc0.user_info_$->{1..3}
          table-strategy:
            inline:
              sharding-column: id
              algorithm-expression: user_info_$->{id % 3 + 1}
          key-generator:
            column: id
            type: SNOWFLAKE
```
> - 编写测试类，共提交十次insert语句，观察分片成功

2022-2-20
- 引入mybatis-plus
- 修改yml-》properties
- 引入范围分片
- 从application.properties文件中分离出shardingjdbc配置文件