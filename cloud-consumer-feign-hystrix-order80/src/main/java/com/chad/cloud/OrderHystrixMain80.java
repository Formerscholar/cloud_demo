package com.chad.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: OrderHystrixMain80
 * @Description: OrderHystrixMain80
 * @author: chad
 * @date: 2021/7/11/011 19:39
 */
@SpringBootApplication
@EnableFeignClients
public class OrderHystrixMain80 {
	public static void main(String[] args) {
		SpringApplication.run(OrderHystrixMain80. class,args);
	}
}
