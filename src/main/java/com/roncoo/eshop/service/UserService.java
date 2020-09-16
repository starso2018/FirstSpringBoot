package com.roncoo.eshop.service;

import java.util.List;

import com.roncoo.eshop.bean.User;

public interface UserService {

	public List<User> findAll();
	
	public Integer insertUser(User user);
}
