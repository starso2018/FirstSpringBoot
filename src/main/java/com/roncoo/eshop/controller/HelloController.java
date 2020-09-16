package com.roncoo.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.roncoo.eshop.bean.User;
import com.roncoo.eshop.service.UserService;

@Controller
public class HelloController {

	  @Autowired
	  private UserService userService;
	  @RequestMapping("/sayHello")
	  public String sayHello(){
		  
		  return "login";
	  }
	  @ResponseBody
	  @RequestMapping(value="/findAll",method=RequestMethod.GET)
	  public List<User> findAll(){
		  List<User> userList = userService.findAll();
		  return userList;
	  }
	  @ResponseBody
	  @RequestMapping(value="/insertUser",method=RequestMethod.POST)
	  public User insertUser(@RequestBody User user){
		  userService.insertUser(user);
		  return user;
	  }
}
