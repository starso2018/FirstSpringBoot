package com.roncoo.eshop.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roncoo.eshop.bean.User;
import com.roncoo.eshop.dao.UserMapper;
import com.roncoo.eshop.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.userMapper.findAll();
	}
	@Override
	@Transactional
	public Integer insertUser(User user) {
		Integer num = this.userMapper.insertUser(user);
		int i = 1/ 0;
		return num;
	}

}
