package com.harish;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ShapesTest {
    Shapes shape;

    @BeforeAll
    static void testCases() {
        System.out.println("Executing Testcases...");
    }

    @BeforeEach
    void init() {
        shape = new Shapes();
    }

    @Test
    void testComputeSquareArea() {
        double actual = shape.computeSquareArea(24);
        double expected = 576;
        assertEquals(expected, actual);
    }

    @Test
    void testComputeCircleArea() {
        double actual = shape.computeCircleArea(5);
        double expected = 78.5;
        assertEquals(expected, actual);
    }
}
