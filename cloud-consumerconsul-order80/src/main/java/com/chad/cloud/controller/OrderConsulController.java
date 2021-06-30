package com.chad.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName: OrderConsulController
 * @Description: 订单控制器
 * @author: chad
 * @date: 2021/6/30/030 16:54
 */
@RestController
@RequestMapping("consumer")
public class OrderConsulController {
	public static final String INVOKE_URL = "http://consul-provider-payment"; //consul-provider-payment

	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/payment/consul")
	public String paymentInfo() {
		String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
		System.out.println("消费者调用支付服务(consule)--->result:" + result);
		return result;
	}
}
