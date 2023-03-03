package prova.prova1.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.nullable;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PersonaTest {

    static private Persona p;

    @BeforeAll
    static void beforePersona(){
        p= new Persona();
        p.setFullName("Mario Rossi");
    }
    
    @Test
    void testSetFullName() {
        assertEquals("Mario Rossi", p.getFullName());
    }
}
