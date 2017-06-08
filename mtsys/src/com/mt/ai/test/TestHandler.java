package com.mt.ai.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestHandler {
	@RequestMapping(value = "/HelloWorld")
	public String handleHelloWorld() {
		System.out.println("哇哈哈，我是SpringMVC，我来啦！");
		return "pages/helloworld";
	}

}
