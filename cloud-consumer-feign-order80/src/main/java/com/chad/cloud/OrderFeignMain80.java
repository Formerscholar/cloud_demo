package com.chad.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: OrderFeignMain80
 * @Description: OrderFeignMain80
 * @author: chad
 * @date: 2021/7/7/007 20:36
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
	public static void main(String[] args) {
		SpringApplication.run(OrderFeignMain80.class, args);
	}
}
