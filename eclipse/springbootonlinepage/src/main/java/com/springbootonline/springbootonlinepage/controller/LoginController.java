package com.springbootonline.springbootonlinepage.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.springbootonline.springbootonlinepage.models.User;


@Controller
public class LoginController {
    
    @GetMapping("/login")
    public ModelAndView showFormLogin(){
        ModelAndView model= new ModelAndView("login");
        return model;
    }

    @PostMapping("/userLog")
    //@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    public @ResponseBody ModelAndView testLogin(User user){   
        ModelAndView model = new ModelAndView("home");
        model.addObject("name", user.getName());
        model.addObject("email", user.getEmail());
        return model;
    }

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        HttpHeaders headers= new HttpHeaders();
        headers.add("Author", "Pino RinoFino");
        return new ResponseEntity<String>("Pagina di test", headers, HttpStatus.OK);        
    }

}
