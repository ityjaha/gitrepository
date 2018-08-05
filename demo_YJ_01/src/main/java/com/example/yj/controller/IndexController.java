package com.example.yj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {
	@RequestMapping(method=RequestMethod.GET)
	public String indexFirst() {
		return "hello spring tool suite!";
	}
	public void testGit() {
		System.out.println("测试git提交");
	}
}
