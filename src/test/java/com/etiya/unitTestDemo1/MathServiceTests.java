package com.etiya.unitTestDemo1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MathServiceTests {

    MathService mathService = new MathService();
    @Test
    void addTests(){
        assertEquals(17,mathService.add(9,8));
        assertEquals(-8,mathService.add(-3,-5));
        assertEquals(0,mathService.add(-1,+1));
    }

    @Test
    void  divideTests(){
        assertEquals(3,mathService.divide(9,3));
        assertEquals(2.5, mathService.divide(10,4));
        assertThrows(IllegalArgumentException.class,()->mathService.divide(10,0),"Division by zero is not allowed.");
    }
}
