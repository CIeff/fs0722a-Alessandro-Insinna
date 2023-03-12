package com.lezione7.lezione7.runners;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.lezione7.lezione7.models.User;
import com.lezione7.lezione7.services.UserService;

@Component
public class UserRunner implements ApplicationRunner {


    @Autowired UserService userService;
    
    @Autowired
    @Qualifier("AdminUserBean")
    ObjectProvider<User> userAdmin;
        

    @Override
    public void run(ApplicationArguments args) throws Exception {
       
        System.out.println("User Runner running");

        /* 
        User user1 = new User();
        user1.setName("Gino");
        user1.setLastname("RinoFino");
        user1.setCity("Ravenna");

        userService.createUser(user1);
        */

        //userService.createUser(userAdmin.getObject());
        



    }
    
}
