package XMLDepend;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IGravity gravity = context.getBean("gravity", Gravity.class);
        gravity.gravityCalculation();
    }
}
