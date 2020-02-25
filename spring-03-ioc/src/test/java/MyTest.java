import com.hzy.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("hehe");
        User user1 = (User) context.getBean("me");
        User user2 = (User) context.getBean("aa");
        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
    }
}
