package com.itheima.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	
	@RequestMapping("user/login")
	public String login(){
		return "login";
	}
}
