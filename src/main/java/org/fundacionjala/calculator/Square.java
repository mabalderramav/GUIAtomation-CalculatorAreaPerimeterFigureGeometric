package org.fundacionjala.calculator;

/**
 * Created by AldoBalderrama on 8/24/2016.
 */
public class Square implements FigureGeometric {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double exponent = 2;
        return Math.pow(side, exponent);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
