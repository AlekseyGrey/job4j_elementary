package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when105to55then5() {
        double expected = 5;
        int x1 = 10;
        int y1 = 5;
        int x2 = 5;
        int y2 = 5;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus55to255then5() {
        double expected = 30;
        int x1 = -5;
        int y1 = 5;
        int x2 = 25;
        int y2 = 5;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when2Minus2to6Minus7then5() {
        double expected = 6.4;
        int x1 = 2;
        int y1 = -2;
        int x2 = 6;
        int y2 = -7;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }


}