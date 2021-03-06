package com.chad.cloud.controller;

import com.chad.cloud.entity.Payment;
import com.chad.cloud.helps.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("consumer")
@Slf4j
public class OrderController {
	public static final String PaymentSrv_URL = "http://CLOUD-PAYMENT-SERVICE";

	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/payment/create")
	public Result<Payment> create(Payment payment) {
		return restTemplate.postForObject(PaymentSrv_URL + "/payment/create", payment, Result.class);
	}


	@GetMapping("/payment/get/{id}")
	public Result<Payment> getPayment(@PathVariable("id") Long id) {
		return restTemplate.getForObject(PaymentSrv_URL + "/payment/get/" + id, Result.class, id);
	}

}
