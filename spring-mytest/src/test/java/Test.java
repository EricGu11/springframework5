import com.eric.config.AppConfig;
import com.eric.service.UserService;
import com.eric.service.UserServiceImpl;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: Eric
 * @Date: 2019/11/11 11:54
 * @Description:
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService u = (UserService) applicationContext.getBean("u");
		u.service();
		/*((AbstractAutowireCapableBeanFactory)applicationContext.getBeanFactory()).setAllowCircularReferences(false);
		applicationContext.register(AppConfig.class);
		applicationContext.refresh();*/
	}
}
