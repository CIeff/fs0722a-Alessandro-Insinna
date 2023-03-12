package com.gestionedispositivi.gestionedispositivi.auth.service;

import com.gestionedispositivi.gestionedispositivi.auth.payload.LoginDto;
import com.gestionedispositivi.gestionedispositivi.auth.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
