package JavaCodeDepend;

import XMLDepend.IGravity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringCinfig.class);

        IGravity gravity = context.getBean("gravityBean", Gravity.class);
        gravity.gravityCalculation();
    }
}
