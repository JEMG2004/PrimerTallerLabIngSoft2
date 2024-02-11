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
public class SquareTest {
  /**
     * Test of calculateArea method, of class Square.
     */
     @org.junit.jupiter.api.Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        
        double side = 1.5;
        Square instance = new Square(side);
        double expResult = side*side;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0);
        
        side = 466666;
        instance = new Square(side);
        expResult = side*side;
        result = instance.calculateArea();
        assertEquals(expResult, result, 0);
        
        side = 15.12;
        instance = new Square(side);
        expResult = side*side;
        result = instance.calculateArea();
        assertEquals(expResult, result, 0);
 
    }

    /**
     * Test of calculatePerimeter method, of class Square.
     */
      @org.junit.jupiter.api.Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        
        double side = 1.5;
        Square instance = new Square(side);
        double expResult = 4*side;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
        
        side = 466666;
        instance = new Square(side);
        expResult = 4*side;
        result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
        
        side = 15.12;
        instance = new Square(side);
        expResult = 4*side;
        result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
}
