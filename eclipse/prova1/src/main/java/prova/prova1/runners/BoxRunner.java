package prova.prova1.runners;

import prova.prova1.classes.Box;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import prova.prova1.configuration.ConfigurationBox;

@Component
public class BoxRunner implements CommandLineRunner{
    
    @Override
    public void run(String...args) throws Exception{
        System.out.println("Run...");

            ApplicationContext appCtx= new AnnotationConfigApplicationContext(ConfigurationBox.class);
        
            Box b1= (Box) appCtx.getBean("box");
            System.out.println(b1);
            Box b2=(Box)appCtx.getBean("box2");
            System.out.println(b2);
    
            

    }

}
