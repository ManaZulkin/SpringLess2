package XMLMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextMap.xml");

        MyKey myKey1 = context.getBean("key1", MyKey.class);
        MyKey myKey2 = context.getBean("key2", MyKey.class);
        MyKey myKey3 = context.getBean("key3", MyKey.class);
        MyKey myKey4 = context.getBean("key4", MyKey.class);

        MySrting mySrting1 = context.getBean("result1", MySrting.class);
        MySrting mySrting2 = context.getBean("result2", MySrting.class);
        MySrting mySrting3 = context.getBean("result3", MySrting.class);
        MySrting mySrting4 = context.getBean("result4", MySrting.class);

        System.out.println("Key - " + myKey1 + ": result - " + mySrting1);
        System.out.println("Key - " + myKey2 + ": result - " + mySrting2);
        System.out.println("Key - " + myKey3 + ": result - " + mySrting3);
        System.out.println("Key - " + myKey4 + ": result - " + mySrting4);

        System.out.println("------------------------------------------------------------------");
        System.out.println("Inner map from xml");

        System.out.println(context.getBean("map", HashMap.class));
    }
}
