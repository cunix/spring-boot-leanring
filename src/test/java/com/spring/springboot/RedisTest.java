package com.spring.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringSpringbootApplication.class)
public class RedisTest {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Test
	public void test() throws Exception {
		// 保存字符串
		for (int i = 1; i < 100001; i++) {
			stringRedisTemplate.opsForValue().set("KEY"+i, "VALUE"+i);
		}
		
	}
}
