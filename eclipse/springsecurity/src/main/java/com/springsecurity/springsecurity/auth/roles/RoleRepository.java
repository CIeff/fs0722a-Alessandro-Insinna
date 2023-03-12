package com.springsecurity.springsecurity.auth.roles;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    
   Optional<Role> findByRoleName(EnumRole roleName);

}
