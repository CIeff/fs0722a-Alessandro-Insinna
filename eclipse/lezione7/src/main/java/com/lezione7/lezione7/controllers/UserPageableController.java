package com.lezione7.lezione7.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lezione7.lezione7.models.User;
import com.lezione7.lezione7.repositories.UserPageableRepository;

@RestController
@RequestMapping("/users/pageable")
public class UserPageableController {
    
    @Autowired UserPageableRepository userPageableRepository;

    @GetMapping
    public ResponseEntity<Page<User>> getPageableUsers(Pageable pageable) {
        Page<User> users = userPageableRepository.findAll(pageable);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
