import com.hzy.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = (People) context.getBean("people");
        System.out.println(people);
        people.getCat().shout();
        people.getDog().shout();
    }
}
