package com.chad.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName: PaymentHystrixService
 * @Description: PaymentHystrixService
 * @author: chad
 * @date: 2021/7/11/011 19:39
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT")
public interface PaymentHystrixService {
	@GetMapping("/payment/hystrix/ok/{id}")
	String paymentInfo_OK(@PathVariable("id") Integer id);
	
	@GetMapping("/payment/hystrix/timeout/{id}")
	String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
