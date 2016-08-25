package org.fundacionjala.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AldoBalderrama on 8/24/2016.
 */
public class RectangleTest {
    @Test
    public void test_calculateArea() {
        double delta = 0;
        double sideA = 3;
        double sideB = 4;
        FigureGeometric rectangle = new Rectangle(sideA, sideB);
        double expected = 12;
        assertEquals(expected, rectangle.calculateArea(), delta);
    }

    @Test
    public void test_calculatePerimeter() {
        double delta = 0;
        double sideA = 3;
        double sideB = 4;
        FigureGeometric rectangle = new Rectangle(sideA, sideB);
        double expected = 14;
        assertEquals(expected, rectangle.calculatePerimeter(), delta);
    }
}