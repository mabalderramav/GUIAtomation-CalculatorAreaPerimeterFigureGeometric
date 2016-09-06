package org.fundacionjala.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Square}
 */
public class SquareTest {
    private static final double DELTA = 0;
    private FigureGeometric square;

    @Before
    public void setUp() {
        final double side = 3;
        square = new Square(side);
    }

    @Test
    public void test_calculateArea() {
        final double expected = 9;
        assertEquals(expected, square.calculateArea(), DELTA);
    }

    @Test
    public void test_calculatePerimeter() {
        final double expected = 12;
        assertEquals(expected, square.calculatePerimeter(), DELTA);
    }
}
