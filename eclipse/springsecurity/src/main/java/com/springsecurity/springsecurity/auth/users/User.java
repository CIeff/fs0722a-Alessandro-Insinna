package com.springsecurity.springsecurity.auth.users;


import java.util.HashSet;
import java.util.Set;

import com.springsecurity.springsecurity.auth.roles.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="users", uniqueConstraints = {@UniqueConstraint(columnNames = "username"),@UniqueConstraint(columnNames = "email")})
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 4, max = 8)
    private String username;
    private String name;
    private String lastname;
    @Email
    private String email;
    @Size(min = 8)
    private String password;
    private boolean active;

    @ManyToMany
    @JoinTable(name="user_roles", joinColumns = @JoinColumn(name="user_id"),
                inverseJoinColumns = @JoinColumn(name="role_id"))
    private Set<Role> roles= new HashSet<>();

}
