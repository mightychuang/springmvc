package com.zhy.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhy.ApplicationContextUtil;
import com.zhy.JSONResult;
import com.zhy.service.UserService;

import static com.zhy.JSONResult.*;

@RestController
public class TestController {

//	private static final UserService userService = ApplicationContextUtil.getBean(UserService.class);
	
	@RequestMapping("/user/name")
	public JSONResult test(){
		UserService service = ApplicationContextUtil.getBean(UserService.class);
		return success(service.getUserName());
	}
}
