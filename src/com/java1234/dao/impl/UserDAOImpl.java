package com.java1234.dao.impl;

import com.java1234.dao.UserDAO;
import com.java1234.model.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public void add(User u) {
		System.out.println("user "+u.getName()+" saved!");
	}

}
