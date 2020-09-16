package com.roncoo.eshop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.roncoo.eshop.bean.User;
@Repository
public interface UserMapper {

	public List<User> findAll();
	
	public Integer insertUser(User user);

}
