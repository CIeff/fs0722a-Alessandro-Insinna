package prova.prova1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import org.springframework.beans.factory.annotation.Value;

import prova.prova1.classes.Box;

@Configuration
@PropertySource("classpath:application.properties")
public class ConfigurationBox {
    
    @Value("${box.x}")
    private int x;
    @Value("${box.y}")
    private int y;
    @Value("${box.name}")
    private String name;
    
    
    @Bean
    public Box box(){
        return new Box(30,20);
        
    }

    @Bean
    public Box box2(){
        Box b = new Box();
        b.setName(name);
        b.setX(x);
        b.setY(y);
        return b;
    }

    @Bean
    public Box box3(){
        return Box.builder()
            .name("prova builder")
            .x(20)
            .y(40)
            .build();
    }
}
