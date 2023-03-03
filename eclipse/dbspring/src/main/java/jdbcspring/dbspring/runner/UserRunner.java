package jdbcspring.dbspring.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jdbcspring.dbspring.model.User;
import jdbcspring.dbspring.service.UserService;

@Component
public class UserRunner  implements CommandLineRunner {
    
    @Autowired UserService userService;

    @Override
    public void run(String... args) throws Exception{
        System.out.println("UserRunner...");

        //userService.insertUser();

        //User user1 =userService.getUserById(4L);
        //System.out.println(user1);

        //user1.setCity("Milano");
        //userService.updateUser(user1);
        //System.out.println(user1);

        //userService.removeUser();

        //List<User> userlist= userService.getAllUsers();
        //userlist.forEach(u->System.out.println(u));
    }
    
}
