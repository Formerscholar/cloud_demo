package com.chad.cloud.helps;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 结果
 *
 * @author Chad
 * @date 2021/06/29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
	private Integer code;
	private String msg;
	private T data;


	public static Result success(Object data) {
		return new Result(200, "success", data);
	}

	public static Result fail(int code, String msg) {
		return new Result(code, msg, null);
	}
}
