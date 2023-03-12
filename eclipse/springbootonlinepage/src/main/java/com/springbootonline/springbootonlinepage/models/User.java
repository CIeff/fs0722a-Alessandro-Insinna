package com.springbootonline.springbootonlinepage.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    
    private String name;
    private String email;
    private String password;

}
