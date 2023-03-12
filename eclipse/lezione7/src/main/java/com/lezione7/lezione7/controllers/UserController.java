package com.lezione7.lezione7.controllers;

import com.lezione7.lezione7.models.User;
import com.lezione7.lezione7.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired UserService userService;
    
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<List<User>>(userService.getAllUsers(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<User>(userService.createUser(user),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        return new ResponseEntity<User>(userService.getUserById(id),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        return new ResponseEntity<User>(userService.updateUser(user),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable Long id){
        return new ResponseEntity<String>(userService.deleteUserById(id),HttpStatus.OK);
    }

}
