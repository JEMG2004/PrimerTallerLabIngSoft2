package com.unicauca.figures.domain.model;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USUARIO
 */
public class CircleTest {
    
    public CircleTest() {
    }

    /**
     * Test of calculateArea method, of class Circle.
     */
    @org.junit.jupiter.api.Test
    public void testCalculateArea() {
        
        System.out.println("calculateArea");
        double radius = 1.5; //probar con un pequeño, mediando y grande
        Circle instance = new Circle(radius);
        double expResult = Math.PI*Math.pow(radius,2);
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
        
        radius = 466666; //probar con un pequeño, mediando y grande
        instance = new Circle(radius);
        expResult = Math.PI*Math.pow(radius,2);
        result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
        
        radius = 15.12; //probar con un pequeño, mediando y grande
        instance = new Circle(radius);
        expResult = Math.PI*Math.pow(radius,2);
        result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of calculatePerimeter method, of class Circle.
     */
    @org.junit.jupiter.api.Test
    public void testCalculatePerimeter() {
        
        double radius = 1.5;
        Circle instance = new Circle(radius);
        double expResult = 2*Math.PI*radius;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
        
        radius = 466666;
        instance = new Circle(radius);
        expResult = 2*Math.PI*radius;
        result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
        
        radius = 15.12;
        instance = new Circle(radius);
        expResult = 2*Math.PI*radius;
        result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
}
