import com.hzy.mapper.UserMapper;
import com.hzy.pojo.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        for (User user : userMapper.getUserList()) {
            System.out.println(user);
        }
    }
}
