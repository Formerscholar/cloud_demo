package com.chad.cloud.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther chad
 * @create 2020-02-02 14:31
 */
@Configuration
public class MySelfRule {
	@Bean
	public IRule myRule() {
		return new RandomRule();//定义为随机
	}
}




