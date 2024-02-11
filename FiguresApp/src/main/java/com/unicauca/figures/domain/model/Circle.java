package com.unicauca.figures.domain.model;

/**
 *
 * @author USUARIO
 */
public class Circle extends Figure {

    private double radius;
    
    //Constructor
    public Circle(double radio){
        this.radius = radio;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI*radius*2;
    }
    //Setters y getters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
}
