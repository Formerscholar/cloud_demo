package com.chad.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 付款main8001
 *
 * @author Chad
 * @date 2021/06/28
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务发现
public class PaymentMain8001 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain8001.class, args);
	}
}
