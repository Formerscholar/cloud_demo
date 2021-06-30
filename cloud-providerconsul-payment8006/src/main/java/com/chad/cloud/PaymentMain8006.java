package com.chad.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: PaymentMain8006
 * @Description: 主启动
 * @author: chad
 * @date: 2021/6/30/030 16:50
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain8006.class, args);
	}
}