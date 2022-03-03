package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationLoopTest {

    @Test
    public void test() {
        assertEquals(0, MultiplicationLoop.mult2(0, 2));
        assertEquals(2, MultiplicationLoop.mult2(1, 2));
        assertEquals(6, MultiplicationLoop.mult2(1, 3));
    }
}