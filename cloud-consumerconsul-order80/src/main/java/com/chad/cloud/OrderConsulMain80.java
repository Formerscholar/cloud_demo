package com.chad.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: OrderConsulMain80
 * @Description: 主启动
 * @author: chad
 * @date: 2021/6/30/030 16:53
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class OrderConsulMain80 {
	public static void main(String[] args) {
		SpringApplication.run(OrderConsulMain80.class, args);
	}
}
