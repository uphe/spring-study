import com.hzy.config.MyConfig;
import com.hzy.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 这里用配置类进行创建上下文对象，相当于之前用applicationContext创建上下文对象
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
