package com.zhy.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public String getUserName(){
		return "name";
	}
	
	public String getAddress(){
		return "address";
	}
}
