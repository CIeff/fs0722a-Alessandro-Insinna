package com.lezione7.lezione7.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lezione7.lezione7.models.User;
import com.lezione7.lezione7.repositories.UserRepository;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
 
    @Autowired UserRepository userRepository;

    public User createUser(User user){
        if(userRepository.existsByNameAndLastname(user.getName(), user.getLastname())){
            throw new EntityExistsException("Utente gia' esistente");
        }else{
        userRepository.save(user);
        return user;
        }
    }

    public String deleteUserById(Long id){
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);  
            return "Utente eliminato con successo";
        }else{
            throw new EntityNotFoundException("Utente non presente nel database");
        }
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        if(userRepository.existsById(id)){
            return userRepository.findById(id).get();
        }else{
            throw new EntityNotFoundException("Id non presente nel database");
        }
       
    }

    public User updateUser(User user){
        if(userRepository.existsById(user.getId())){
            userRepository.save(user);  
            return user;
        }else{
            throw new EntityNotFoundException("Utente non presente nel database");
        }

    }

}
