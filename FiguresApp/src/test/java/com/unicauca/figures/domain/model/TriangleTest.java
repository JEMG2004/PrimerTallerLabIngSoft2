/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.unicauca.figures.domain.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laura Sofia
 */
public class TriangleTest {
    
    /**
     * Test of calculateArea method, of class Triangle.
     */
    @org.junit.jupiter.api.Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        
        double side1 = 1.5;
        double side2 = 1.0;
        double side3 = 0.5;
       
        Triangle instance = new Triangle (side1,side2, side3);
        double s = (side1 + side2 + side3) / 2;
        double expResult = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0);
        
        side1 = 5;
        side2 = 10;
        side3 = 13;
       
        instance = new Triangle(side1, side2, side3);
        s = (side1 + side2 + side3) / 2;
        expResult = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        result = instance.calculateArea();
        assertEquals(expResult, result, 0);
        
        side1 = 15;
        side2 = 20;
        side3 = 20;
        
        instance = new Triangle(side1, side2, side3);
        s = (side1 + side2 + side3) / 2;
        expResult = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        result = instance.calculateArea();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of calculatePerimeter method, of class Triangle.
     */
    @org.junit.jupiter.api.Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        
          
        double side1 = 1.5;
        double side2 = 1.0;
        double side3 = 0.5;
       
        Triangle instance = new Triangle (side1,side2, side3);
        
        double expResult = side1 + side2 + side3;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0);
        
        side1 = 5;
        side2 = 10;
        side3 = 13;
        
        instance = new Triangle ( side1,side2, side3);
        expResult = side1 + side2 + side3;
        result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0);
        
        side1 = 15;
        side2 = 20;
        side3 = 20;

        instance = new Triangle (side1,side2, side3);
        expResult = side1 + side2 + side3;
        result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0);
    }
}
