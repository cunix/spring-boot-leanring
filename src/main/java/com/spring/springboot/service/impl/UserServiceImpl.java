package com.spring.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springboot.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	//private JdbcTemplate jdbcTemplate;

	@Override
	public void create(String name, Integer age) {
		//jdbcTemplate.update("insert into USER(NAME, AGE) values(?, ?)", name, age);
	}

	@Override
	public void deleteByName(String name) {
		//jdbcTemplate.update("delete from USER where NAME = ?", name);
	}

	@Override
	public Integer getAllUsers() {
		//return jdbcTemplate.queryForObject("select count(1) from USER", Integer.class);
		return null;
	}

	@Override
	public void deleteAllUsers() {
		//jdbcTemplate.update("delete from USER");
	}
}
