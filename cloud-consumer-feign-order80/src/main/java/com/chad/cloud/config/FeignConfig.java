package com.chad.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: FeignConfig
 * @Description: FeignConfig
 * @author: chad
 * @date: 2021/7/7/007 21:30
 */
@Configuration
public class FeignConfig
{
	@Bean
	Logger.Level feignLoggerLevel()
	{
		return Logger.Level.FULL;
	}
}
