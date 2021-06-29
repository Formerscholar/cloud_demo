package com.chad.cloud.dao;

import com.chad.cloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * (Payment)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-28 13:41:34
 */
@Mapper
public interface PaymentDao {

	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);

}

