package com.springsecurity.springsecurity.auth.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImplementation  implements UserDetailsService{

    @Autowired UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {       
        //throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
        User user= userRepository.findByUsername(username)
            .orElseThrow(()-> new UsernameNotFoundException("User not found with username: "+ username));

        return UserDetailsImpl.build(user);
    }
    
}
