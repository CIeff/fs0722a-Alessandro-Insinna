package prova.prova1.classes;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    private String fullName;   
    
    @Autowired    
    private ArrayList<String> materiePreferite;
 
        
}
