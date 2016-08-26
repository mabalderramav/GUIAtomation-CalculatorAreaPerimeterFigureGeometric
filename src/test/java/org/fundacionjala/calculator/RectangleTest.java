package org.fundacionjala.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Rectangle}
 */
public class RectangleTest {
    private static final double DELTA = 0;
    private FigureGeometric rectangle;

    @Before
    public void setUp() {
        final double sideA = 3;
        final double sideB = 4;
        rectangle = new Rectangle(sideA, sideB);
    }

    @Test
    public void test_calculateArea() {
        final double expected = 12;
        assertEquals(expected, rectangle.calculateArea(), DELTA);
    }

    @Test
    public void test_calculatePerimeter() {
        final double expected = 14;
        assertEquals(expected, rectangle.calculatePerimeter(), DELTA);
    }
}
