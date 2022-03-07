
package ru.job4j.condition;

        import org.junit.Assert;
        import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then1or2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To2To3Then5() {
        int first = 5;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To2To3To12Then12() {
        int first = 5;
        int second = 2;
        int third = 3;
        int fourth = 12;
        int result = Max.max(first, second, third, fourth);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

}