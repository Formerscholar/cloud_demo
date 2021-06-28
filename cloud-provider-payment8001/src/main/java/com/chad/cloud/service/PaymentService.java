package com.chad.cloud.service;

import com.chad.cloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Payment)表服务接口
 *
 * @author makejava
 * @since 2021-06-28 13:41:36
 */
public interface PaymentService {

	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);
}
