package org.fundacionjala.calculator;

/**
 * Created by AldoBalderrama on 8/24/2016.
 */
public class Rectangle implements FigureGeometric {
    private final double sideA;
    private final double sideB;
    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public double calculateArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * this.sideA + 2 * this.sideB;
    }
}
