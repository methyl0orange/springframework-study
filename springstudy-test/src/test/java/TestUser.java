import com.wxc.bean.AnnotationConfig;
import com.wxc.bean.AnnotationTestBean;
import com.wxc.bean.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.tests.sample.beans.AnnotatedBean;

public class TestUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        User userbest=context.getBean(User.class);
        System.out.println(userbest.toString());


        AnnotationConfigApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(AnnotationConfig.class);
        AnnotationTestBean annotatedBean=(AnnotationTestBean) applicationContext.getBean("annotationTestBean");
        System.out.println(annotatedBean.toString());


        User user=new User();
        user.setId("fghjk");
        System.out.println(user.toString());
    }
}
