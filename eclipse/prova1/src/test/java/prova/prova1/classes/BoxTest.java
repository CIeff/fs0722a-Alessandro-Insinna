package prova.prova1.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;



public class BoxTest {

    /* 
    @BeforeTestClass
    public static void beforeClassTest(){
        
        Box b2=new Box(20,10,"BoxTest");
        System.out.println(b2.getPerimeter());;
    }
    
    @BeforeAll
    public static void beforeTest(){
        Box b2=new Box(20,10,"BoxTest");
        System.out.println(b2.getArea());;
    }
    */
    
    @Test
    void testGetArea() {
        Box b = new Box(20,10,"BoxTest");
        assertEquals(200,b.getArea());
    }

    @Test
    void testRett(){
        Box b= new Box(20,10,"BoxTest");
        assertTrue((b.getX()!=b.getY()));
    }

    @Test
    void testGetPerimetro(){
        Box b= new Box(20,10,"BoxTest");
        assertEquals(60, b.getPerimeter());
    }
    
}
