package com.chad.cloud.service.Impl;

import com.chad.cloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: PaymentServiceImpl
 * @Description: PaymentService
 * @author: chad
 * @date: 2021/7/11/011 17:02
 */
@Service
public class PaymentServiceImpl implements PaymentService {
	public String paymentInfo_OK(Integer id) {
		return "线程池:" + Thread.currentThread().getName() + "paymentInfo_OK,id: " + id + "\t" + "O(∩_∩)O";
	}
	
	@HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
	})
	public String paymentInfo_TimeOut(Integer id) {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "线程池:" + Thread.currentThread().getName() + "paymentInfo_TimeOut,id: " + id + "\t" + "O(∩_∩)O，耗费3秒";
	}
	
	public String paymentInfo_TimeOutHandler(Integer id) {
		return "/(ㄒoㄒ)/调用支付接口超时或异常：\t" + "\t当前线程池名字" + Thread.currentThread().getName();
	}
}
