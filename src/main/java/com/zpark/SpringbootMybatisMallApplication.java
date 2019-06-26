package com.zpark;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/* 扫描mapper的地址 */
@MapperScan("com.zpark.mapper")
public class SpringbootMybatisMallApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisMallApplication.class, args);
		
	}
	
}
