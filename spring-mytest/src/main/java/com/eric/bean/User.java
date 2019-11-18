package com.eric.bean;

/**
 * @author: Eric
 * @Date: 2019/11/11 13:11
 * @Description:
 */
public class User {
	private String username;
	private Integer age;

	public User() {
		System.out.println("user constructor...");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
