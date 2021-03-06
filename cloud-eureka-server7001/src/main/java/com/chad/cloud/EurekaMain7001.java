package com.chad.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaMain7001
 * @Description: 主启动
 * @author: chad
 * @date: 2021/6/29/029 11:48
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
	public static void main(String[] args) {
		SpringApplication.run(EurekaMain7001.class, args);
	}
}
