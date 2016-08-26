package org.fundacionjala.calculator;

/**
 * Calculates the perimeter and area
 */
public class Square implements FigureGeometric {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateArea() {
        double exponent = 2;
        return Math.pow(side, exponent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
