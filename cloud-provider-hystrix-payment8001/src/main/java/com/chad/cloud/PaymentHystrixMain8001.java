package com.chad.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: com.chad.cloud.PaymentHystrixMain8001
 * @Description: com.chad.cloud.PaymentHystrixMain8001
 * @author: chad
 * @date: 2021/7/11/011 17:00
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixMain8001 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentHystrixMain8001.class, args);
	}
}
