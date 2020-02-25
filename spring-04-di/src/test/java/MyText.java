
import com.hzy.pojo.Student;
import com.hzy.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyText {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        User user1 = (User) context.getBean("user");
        System.out.println(user.toString());
        System.out.println(user == user1);

        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
