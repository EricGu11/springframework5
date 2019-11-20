package com.eric.service;

import org.springframework.stereotype.Service;

/**
 * @author: Eric
 * @Date: 2019/11/19 8:42
 * @Description:
 */
@Service(value = "u")
public class UserServiceImpl implements UserService {
	@Override
	public void service() {
		System.out.println("UserServiceImpl service ....");
	}
}
