package com.chad.cloud.controller;

import com.chad.cloud.entity.Payment;
import com.chad.cloud.helps.Result;
import com.chad.cloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @ClassName: OrderFeignController
 * @Description: OrderFeignController
 * @author: chad
 * @date: 2021/7/7/007 20:39
 */
@RestController
@RequestMapping("consumer")
public class OrderFeignController {
	@Resource
	private PaymentFeignService paymentFeignService;

	@GetMapping(value = "/payment/get/{id}")
	public Result<HashMap> getPaymentById(@PathVariable("id") Long id) {
		return paymentFeignService.getPaymentById(id);
	}

	@GetMapping(value = "/payment/feign/timeout")
	String paymentFeignTimeOut() {
		return paymentFeignService.paymentFeignTimeOut();
	}

}
