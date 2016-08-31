package com.java1234.service;

import com.java1234.dao.UserDAO;
import com.java1234.model.User;
import com.java1234.spring.ClassPathApplicationContext;

public class UserService {
	
	public void add(User u){
		
		ClassPathApplicationContext application=new ClassPathApplicationContext();
		UserDAO userDao=(UserDAO) application.getBean("userDAO");
		userDao.add(u);
	}

}
