package com.chad.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Payment)实体类
 *
 * @author makejava
 * @since 2021-06-28 13:41:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
	/**
	 * ID
	 */
	private Long id;

	private String serial;

}
