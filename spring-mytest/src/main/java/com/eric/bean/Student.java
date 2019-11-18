package com.eric.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Eric
 * @Date: 2019/11/12 17:05
 * @Description:
 */
//@Component
public class Student {
	private String name;

	@Autowired
	private Address address;


}
