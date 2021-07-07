package com.chad.cloud.service;

import com.chad.cloud.entity.Payment;
import com.chad.cloud.helps.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;

/**
 * @ClassName: PaymentFeignService
 * @Description: PaymentFeignService
 * @author: chad
 * @date: 2021/7/7/007 20:37
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
	@GetMapping(value = "/payment/get/{id}")
	Result<HashMap> getPaymentById(@PathVariable("id") Long id);


	@GetMapping(value = "/payment/feign/timeout")
	String paymentFeignTimeOut();
}