import com.hzy.service.UserService;
import com.hzy.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserServiceImpl) context.getBean("userServiceImpl");
        userService.getUser();
    }
}