import com.eric.config.AppConfig;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Eric
 * @Date: 2019/11/11 11:54
 * @Description:
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		/*((AbstractAutowireCapableBeanFactory)applicationContext.getBeanFactory()).setAllowCircularReferences(false);
		applicationContext.register(AppConfig.class);
		applicationContext.refresh();*/
	}
}
