package org.fundacionjala.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AldoBalderrama on 8/24/2016.
 */
public class CircleTest {

    @Test
    public void test_calculateArea() {
        double delta = 0;
        double radio = 3;
        FigureGeometric circle = new Circle(radio);
        double expected = 28.274333882308138;
        assertEquals(expected, circle.calculateArea(), delta);
    }

    @Test
    public void test_calculatePerimeter() {
        double delta = 0;
        double radio = 3;
        FigureGeometric circle = new Circle(radio);
        double expected = 18.84955592153876;
        assertEquals(expected, circle.calculatePerimeter(), delta);
    }
}