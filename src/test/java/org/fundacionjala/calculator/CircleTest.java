package org.fundacionjala.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Circle}
 */
public class CircleTest {
    private static final double DELTA = 0;
    private FigureGeometric circle;

    @Before
    public void setUp() {
        final int radio = 3;
        circle = new Circle(radio);
    }

    @Test
    public void test_calculateArea() {
        final double expected = 28.274333882308138;
        assertEquals(expected, circle.calculateArea(), DELTA);
    }

    @Test
    public void test_calculatePerimeter() {
        final double expected = 18.84955592153876;
        assertEquals(expected, circle.calculatePerimeter(), DELTA);
    }

}
