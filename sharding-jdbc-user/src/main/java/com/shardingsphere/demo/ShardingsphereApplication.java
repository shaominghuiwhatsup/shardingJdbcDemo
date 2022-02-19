package com.shardingsphere.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@MapperScan("com.shardingsphere.demo.mapper")
public class ShardingsphereApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingsphereApplication.class, args);
	}

}
