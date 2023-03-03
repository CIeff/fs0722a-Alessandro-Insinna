package dbspring2.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dbspring2.jpa.model.User;
import dbspring2.jpa.repository.UserDaoRepository;

@Service
public class UserService {
    
    @Autowired UserDaoRepository repo;

    public void insertUser(User u){
        repo.save(u);
    }

    public User getUserById(Long id){
       return repo.findById(id).get();
       
    }

    public void updateUser(User user){
        repo.save(user);
    }

    public void removeUser(Long id){
        repo.deleteById(id);
    }

    public void removeUser(User user){
        repo.delete(user);
    }

    public List<User> getAllUsers(){
        return (List<User>) repo.findAll();
    }

    public List<User> getAgeBetween(Integer min, Integer max){
        return repo.findByAgeBetween(min, max);
    }

}


