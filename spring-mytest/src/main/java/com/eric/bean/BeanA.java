package com.eric.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Eric
 * @Date: 2019/11/15 16:36
 * @Description:
 */
@Component
public class BeanA {
	@Autowired
	private BeanB beanB;
}
