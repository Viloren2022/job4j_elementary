package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to55then7dot07() {
        double expected = 7.07;
        Point a = new Point(0, 0);
        Point b = new Point(5, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to07then6dot40() {
        double expected = 6.40;
        Point a = new Point(4, 2);
        Point b = new Point(0, 7);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to68then7dot07() {
        double expected = 7.07;
        Point a = new Point(1, 3);
        Point b = new Point(6, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3712to258then4dot58() {
        double expected = 4.58;
        Point c = new Point(3, 7, 12);
        Point d = new Point(2, 5, 8);
        double out = c.distance3d(d);
        Assert.assertEquals(expected, out, 0.01);
    }
}