package com.springsecurity.springsecurity.auth.users;

import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class UserDetailsImpl implements UserDetails {

    private Long id;
    private String username;
    private String email;
    @JsonIgnore
    private String password;

    private Collection<? extends GrantedAuthority> authorities;

    private boolean accountNonLocked = true;
    private boolean accountNonExpired =false;
    private boolean credentialsNonExpired=true;
    private boolean enabled =true;
    
    private Date expirationTime;

    public UserDetailsImpl(Long id, String username, String email, String password, Collection<?extends GrantedAuthority> authorities, boolean enabled) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
        this.enabled = enabled;
    }

    public static UserDetailsImpl build(User user){
        List<GrantedAuthority>authorities= user.getRoles().stream()
            .map(role-> new SimpleGrantedAuthority(role.getRole().name()))
            .collect(Collectors.toList());

        return new UserDetailsImpl(user.getId(), user.getUsername(), user.getEmail(), user.getPassword(), authorities, user.isActive());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
        //throw new UnsupportedOperationException("Unimplemented method 'getAuthorities'");
    }
    @Override
    public String getPassword() {
        return password;
        //throw new UnsupportedOperationException("Unimplemented method 'getPassword'");
    }
    @Override
    public String getUsername() {
        return username;
        //throw new UnsupportedOperationException("Unimplemented method 'getUsername'");
    }
    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
        //throw new UnsupportedOperationException("Unimplemented method 'isAccountNonExpired'");
    }
    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
        //throw new UnsupportedOperationException("Unimplemented method 'isAccountNonLocked'");
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
        //throw new UnsupportedOperationException("Unimplemented method 'isCredentialsNonExpired'");
    }
    @Override
    public boolean isEnabled() {
        return enabled;
        //throw new UnsupportedOperationException("Unimplemented method 'isEnabled'");
    }


    
    
}
