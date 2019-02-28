package com.talabat1.talabat1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.talabat1.talabat1.domain.rest")
public class Talabat1Application {
	public static void main(String[] args) {
		SpringApplication.run(Talabat1Application.class, args);
	}

}

