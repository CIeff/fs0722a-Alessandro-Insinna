package com.gestionedispositivi.gestionedispositivi.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionedispositivi.gestionedispositivi.auth.entity.ERole;
import com.gestionedispositivi.gestionedispositivi.auth.entity.Role;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

	Optional<Role> findById(Long id);

    List<Role> findAll();

    Role save(ERole role);


}
