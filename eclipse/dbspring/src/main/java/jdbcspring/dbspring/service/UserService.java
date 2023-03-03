package jdbcspring.dbspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdbcspring.dbspring.model.User;
import jdbcspring.dbspring.repository.UserDaoJdbc;

@Service
public class UserService {
    
    @Autowired UserDaoJdbc jdbc;

    public User createTestUser(){
        User u= User.builder()
        .name("Mario")
        .lastName("Rossi")
        .city("Roma")
        .age(30)
        .email("ma@rio.rosseei.issi2")
        .build();
        return u;
    }

    public void insertUser(){
        jdbc.createUser(createTestUser());
    }

    public User getUserById(Long id){
        User u =jdbc.getUserById(id);
        return u;
    }

    public void updateUser(User user){
        jdbc.updateUser(user);
    }

    public void removeUser(Long id){
        jdbc.removeUser(id);
    }

    public List<User> getAllUsers(){
        return jdbc.getAllUsers();
    }
}
