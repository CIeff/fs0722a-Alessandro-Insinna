package dbspring2.jpa.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import dbspring2.jpa.model.User;
import dbspring2.jpa.service.UserService;

@Component
public class UserRunner implements ApplicationRunner{

    @Autowired UserService userService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        
        System.out.println("UserRunner...");


         // User u= new User();
         // u.setName("Mario22");
         // u.setLastName("Rossi22");       
         // u.setCity("Roma22");
         // u.setAge(35);
         // u.setEmail("ma@r22i5r1o.rossi");        

        // userService.insertUser(u);

        // List<User> userList= userService.getAllUsers();
        // userList.forEach(e->System.out.println(e));

        // User ul= userService.getUserById(1L);
        // System.out.println(ul);
        // ul.setCity("Milano");
        // userService.updateUser(ul);
        // System.out.println(ul);// 

        // userService.removeUser(ul);

        List<User> ulByAge= userService.getAgeBetween(20, 31);
        System.out.println(ulByAge);
    }
    
}
