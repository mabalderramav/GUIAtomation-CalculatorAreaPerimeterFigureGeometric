package org.fundacionjala.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AldoBalderrama on 8/24/2016.
 */
public class SquareTest {
    @Test
    public void test_calculateArea() {
        double delta = 0;
        double side = 3;
        FigureGeometric square = new Square(side);
        double expected = 9;
        assertEquals(expected, square.calculateArea(), delta);
    }
    @Test
    public void test_calculatePerimeter() {
        double delta = 0;
        double side = 3;
        FigureGeometric square = new Square(side);
        double expected = 12;
        assertEquals(expected, square.calculatePerimeter(), delta);
    }
}