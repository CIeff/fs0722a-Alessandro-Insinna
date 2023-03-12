package com.lezione7.lezione7.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.lezione7.lezione7.models.User;

public interface UserPageableRepository extends PagingAndSortingRepository<User,Long>{
    
}
