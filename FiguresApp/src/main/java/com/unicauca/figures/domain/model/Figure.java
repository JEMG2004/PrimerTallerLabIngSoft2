package com.unicauca.figures.domain.model;

/**
 *
 * @author USUARIO
 */
public abstract class Figure { //abstract es que no se puede instanciar como tal
    private double x1;
    private double y1;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
}
