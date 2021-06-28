package com.chad.cloud.helps;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther chad
 * @create 2020-01-27 20:17
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
 
 
