import com.qq.config.qqConfig;
import com.qq.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(qqConfig.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());

    }
}
