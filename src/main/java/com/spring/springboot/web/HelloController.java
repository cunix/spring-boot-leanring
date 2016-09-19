package com.spring.springboot.web;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		return "Hello World!";
	}
	
	@RequestMapping("/")
	public String index(ModelMap map){
		map.addAttribute("host", "https://github.com");
		return "index";
	}
	
}
