package prova.prova1.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.test.context.event.annotation.BeforeTestClass;


public class BoxTestParameters {

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 2 })
    public void testGetArea(int side) {
        Box box = new Box(side, side);
        assertEquals(side * side, box.getArea());
    }

    @ParameterizedTest
    @CsvSource({"1,2,2","2,2,4"})
    public void testGetArea2(int side, int side2, int expArea) {
        Box box = new Box(side, side2);
        assertEquals(side *side2, box.getArea());
    }

    @ParameterizedTest
    @CsvSource({ "1,2,6", "2,3,10", "3,4,14" })
    public void testGetPerimeter(int length, int width, int expectedPerimeter) {
        Box box = new Box(length, width);
        assertEquals((length*2+width*2), box.getPerimeter());
    }

}