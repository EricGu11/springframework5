package com.eric.config;

import com.eric.bean.Student;
import com.eric.bean.User;
import org.springframework.context.annotation.*;

/**
 * @author: Eric
 * @Date: 2019/11/11 12:57
 * @Description:
 */
@ComponentScan(basePackages = "com.eric")
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

	/*@Bean
	public User user(){
		return new User();
	}*/
}
