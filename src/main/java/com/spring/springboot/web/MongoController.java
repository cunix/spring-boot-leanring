package com.spring.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springboot.model.User;
import com.spring.springboot.service.UserMongoRepositoryService;

@RestController
@RequestMapping("mongo")
public class MongoController {
	
	@Autowired
	private UserMongoRepositoryService userMongoRepositoryService;
	
	
	@RequestMapping("insert")
	public void insert(){
		for (int i = 1; i < 100001; i++) {
			userMongoRepositoryService.save(new User(i,i, "Wincent"+i, "Male"));
		}
	}
	
	
	@RequestMapping("query")
	public List<User> query(){
		return userMongoRepositoryService.findAll();
	}
	
	
	
}
