package com.chad.cloud.service;

/**
 * @ClassName: PaymentService
 * @Description: PaymentService
 * @author: chad
 * @date: 2021/7/11/011 17:02
 */
public interface PaymentService {
	String paymentInfo_OK(Integer id);
	
	String paymentInfo_TimeOut(Integer id);
}
