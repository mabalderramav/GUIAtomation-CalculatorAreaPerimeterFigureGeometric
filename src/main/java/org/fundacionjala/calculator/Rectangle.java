package org.fundacionjala.calculator;

/**
 * Calculates the perimeter and area
 */
public class Rectangle implements FigureGeometric {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateArea() {
        return this.sideA * this.sideB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (this.sideA + this.sideB);
    }
}
