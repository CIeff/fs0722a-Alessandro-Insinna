package com.lezione7.lezione7.repositories;

import com.lezione7.lezione7.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    
    public boolean existsByNameAndLastname(String name, String lastname);

}
