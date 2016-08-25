package org.fundacionjala.calculator;

/**
 * Created by AldoBalderrama on 8/24/2016.
 */
public class Circle implements FigureGeometric {
    private final double radio;
    public Circle(double radio){
        this.radio = radio;
    }
    @Override
    public double calculateArea() {
        int exponent = 2;
        return Math.PI * Math.pow(this.radio,exponent);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radio;
    }
}