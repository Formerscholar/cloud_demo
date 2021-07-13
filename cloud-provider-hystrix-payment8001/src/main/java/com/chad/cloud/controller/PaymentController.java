package com.chad.cloud.controller;

import com.chad.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: PaymentController
 * @Description: PaymentController控制器
 * @author: chad
 * @date: 2021/7/11/011 17:04
 */
@RestController
@Slf4j
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	
	@Value("${server.port}")
	private String serverPort;
	
	
	@GetMapping("/payment/hystrix/ok/{id}")
	public String paymentInfo_OK(@PathVariable("id") Integer id) {
		String result = paymentService.paymentInfo_OK(id);
		log.info("****result: " + result);
		return result;
	}
	
	@GetMapping("/payment/hystrix/timeout/{id}")
	public String paymentInfo_TimeOut(@PathVariable("id") Integer id) throws InterruptedException {
		String result = paymentService.paymentInfo_TimeOut(id);
		log.info("****result: " + result);
		return result;
	}
	
}
