import com.hzy.config.AppConfig;
import com.hzy.pojo.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //User user = (User) context.getBean("user");
        //等价于上面的用法
        User user = context.getBean("user",User.class);
        System.out.println(user);
    }
}
