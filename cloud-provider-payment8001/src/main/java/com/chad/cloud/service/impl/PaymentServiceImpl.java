package com.chad.cloud.service.impl;

import com.chad.cloud.dao.PaymentDao;
import com.chad.cloud.entity.Payment;
import com.chad.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Payment)表服务实现类
 *
 * @author makejava
 * @since 2021-06-28 13:41:37
 */
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {
	@Resource
	private PaymentDao paymentDao;

	@Override
	public int create(Payment payment) {
		return paymentDao.create(payment);
	}

	@Override
	public Payment getPaymentById(Long id) {
		return paymentDao.getPaymentById(id);
	}

}
