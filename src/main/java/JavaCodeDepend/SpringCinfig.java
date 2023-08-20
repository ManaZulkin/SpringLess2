package JavaCodeDepend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCinfig   {
    @Bean
    public Gravity gravityBean(){
        return new Gravity();
    }
}
