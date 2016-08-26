package org.fundacionjala.calculator;

/**
 * Calculates the perimeter and area
 */
public class Circle implements FigureGeometric {
    private final double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateArea() {
        int exponent = 2;
        return Math.PI * Math.pow(this.radio, exponent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radio;
    }
}
