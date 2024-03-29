package com.unicauca.figures.domain.model;

/**
 *
 * @author 
 */
public class Triangle extends Figure{
    
      double side1,side2,side3;

    public Triangle(double side1, double side2,double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side2+ side3 + side1 ;
    }
    
    //Setters y getters
    public double getBase() {
        return side1;
    }

    public void setBase(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    
    
}
