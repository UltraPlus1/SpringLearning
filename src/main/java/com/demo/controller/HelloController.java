package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//定义为control 层
@Controller
public class HelloController {

	//映射路由  响应头
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello,world";
	}
}

