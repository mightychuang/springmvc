package com.zhy;

public class JSONResult {
	
	public static Integer SUCCESS_CODE = 0;
	public static Integer FAIL_CODE = 100;
	
	private Integer code;
	private String msg;
	private Object data;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	

	
	private JSONResult(Integer code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	private JSONResult(){};
	
	public static JSONResult success(){
		return success(null);
	}
	
	public static JSONResult success(Object data){
		return success(null, data);
	}
	
	public static JSONResult success(String msg,Object data){
		return new JSONResult(SUCCESS_CODE, msg, data);
	}
	
	public static JSONResult fail(){
		return fail(null);
	}
	
	public static JSONResult fail(Object data){
		return fail(null, data);
	}
	public static JSONResult fail(String msg,Object data){
		return new JSONResult(FAIL_CODE, msg, data);
	}

}
