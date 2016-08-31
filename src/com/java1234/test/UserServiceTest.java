package com.java1234.test;

import org.junit.Test;

import com.java1234.model.User;
import com.java1234.service.UserService;

public class UserServiceTest {

	@Test
	public void testUserService() {
		User user=new User();
		user.setName("张三");
		user.setAge(12);
		UserService userService=new UserService();
		userService.add(user);
	}

}
