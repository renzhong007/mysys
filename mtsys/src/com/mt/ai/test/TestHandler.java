package com.mt.ai.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestHandler {
	@RequestMapping(value = "/HelloWorld")
	public String handleHelloWorld() {
		System.out.println("�۹���������SpringMVC����������");
		return "pages/helloworld";
	}

}
