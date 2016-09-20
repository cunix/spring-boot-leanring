package com.spring.springboot.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class RedisController {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@RequestMapping("insert")
	public void insert() throws Exception {
		// 保存字符串
		for (int i = 1; i < 100001; i++) {
			stringRedisTemplate.opsForValue().set("KEY"+i, "VALUE"+i);
		}
	}
	
	@RequestMapping("query")
	public List query() throws Exception {
		List<String> list=new ArrayList<String>();
		for (int i = 1; i < 100001; i++) {
			list.add(stringRedisTemplate.opsForValue().get("KEY"+i));
		}
		return list;
	}
}
