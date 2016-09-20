package com.spring.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@Value("${com.wincent.name}")
	private String name;
	@Value("${com.wincent.gender}")
	private String gender;
	@Value("${com.wincent.email}")
	private String email;
	@Value("${com.wincent.age}")
	private Integer age;
	
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello World!";
	}
	
	@RequestMapping("/")
	public String index(ModelMap map){
		map.addAttribute("host", "https://github.com");
		return "index";
	}
	

	@RequestMapping("/errorTest")
	public String error(ModelMap map){
		throw new RuntimeException();
	}
	
	
	@RequestMapping("/personalInfo")
	public String presonalInfo(){
		return name+"\t"+age+"\t"+gender+"\t"+email+"\t";
	}
	
}
