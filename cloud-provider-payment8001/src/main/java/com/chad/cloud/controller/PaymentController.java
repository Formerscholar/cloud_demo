package com.chad.cloud.controller;

import com.chad.cloud.entity.Payment;
import com.chad.cloud.helps.Result;
import com.chad.cloud.service.PaymentService;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Payment)表控制层
 *
 * @author makejava
 * @since 2021-06-28 13:41:38
 */
@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {
	/**
	 * 服务对象
	 */
	@Resource
	private PaymentService paymentService;

	@Value("${server.port}")
	private String serverPort;

	@Resource
	private DiscoveryClient discoveryClient;

	@PostMapping("/create")
	public Result<Payment> create(@RequestBody Payment payment) {
		int result = paymentService.create(payment);
		log.info("*****插入操作返回结果:" + result + "\t 服务端口：" + serverPort);

		if (result > 0) {
			return Result.success(result);
		} else {
			return Result.fail(444, "插入数据库失败");
		}
	}

	@GetMapping("/get/{id}")
	public Result<Payment> getPaymentById(@PathVariable("id") Long id) {
		Payment payment = paymentService.getPaymentById(id);
		log.info("*****O(∩_∩)O查询结果:{}", payment + "\t 服务端口：" + serverPort);
		if (payment != null) {
			return Result.success(payment);
		} else {
			return Result.fail(444, "没有对应记录,查询ID: " + id);
		}
	}

	@GetMapping(value = "/discovery")
	public Object discovery()
	{
		List<String> services = discoveryClient.getServices();
		for (String element : services) {
			System.out.println(element);
		}

		List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
		for (ServiceInstance element : instances) {
			System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
				+ element.getUri());
		}
		return this.discoveryClient;
	}


}
