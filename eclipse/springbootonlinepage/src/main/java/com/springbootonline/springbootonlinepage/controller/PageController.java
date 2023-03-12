package com.springbootonline.springbootonlinepage.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import jakarta.websocket.server.PathParam;

@Controller
@RequestMapping("/api")
public class PageController {
    

    @GetMapping("/home")
    public @ResponseBody String getHomePage(){
        return "Pagina Home";
    }

    //localhost:8080/api/testPar?name=nome&lastName=cognome
    @GetMapping("/testPar")
    public @ResponseBody String getTestParam(@RequestParam String name, @RequestParam String lastName, @RequestParam(name="age", required=false)String age){
        return "Test parameter: "+name+" "+lastName+" age: "+age;
    }

    //localhost:8080/api/testPar2/nome/cognome
    @GetMapping("/testPar2/{name}/{lastName}")
    public @ResponseBody String getTestParam2(@PathVariable String name, @PathVariable String lastName){
        return "Test parameter2: "+name+" "+lastName;
    }

    @GetMapping("/test3/{name}/{lastName}")
    public String getTestThymeleaf(
            Map<String,Object> model,
            @PathVariable String name, @PathVariable String lastName){
        model.put("testName", name);
        model.put("testLastName",lastName);
        return "test"; 
    }

    
    @GetMapping("/test4/{name}/{lastName}")
    public String getTestThymeleaf( 
                                    Model model,
                                    @PathVariable String name, 
                                    @PathVariable String lastName){
                                        model.addAttribute("testName", name);
                                        model.addAttribute("testLastName",lastName);
            return "test"; 
    }
    

    @GetMapping("/test5/{name}/{lastName}")
    public ModelAndView getTestThymeleaf(
            @PathVariable String name, @PathVariable String lastName){
        ModelAndView model = new ModelAndView("test");
        model.addObject("testName", name);
        model.addObject("testLastName", lastName);
        return model; 
    }
}
