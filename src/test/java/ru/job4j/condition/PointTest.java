package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to55then7dot07() {
        double expected = 7.07;
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to07then6dot40() {
        double expected = 6.40;
        int x1 = 4;
        int y1 = 2;
        int x2 = 0;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to68then7dot07() {
        double expected = 7.07;
        int x1 = 1;
        int y1 = 3;
        int x2 = 6;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}