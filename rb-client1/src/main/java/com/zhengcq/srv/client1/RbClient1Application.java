package com.zhengcq.srv.client1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhengcq.srv.client1")
public class RbClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(RbClient1Application.class, args);
	}

}
