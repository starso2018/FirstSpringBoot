package com.roncoo.eshop.bean;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 3361260289833830815L;
	
	private Integer id;
	private String name;
	private Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
