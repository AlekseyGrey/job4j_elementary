package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isCloseTo(expected, offset(0.01));
    }

    @Test
    void whenP15K3Square10() {
        double expected = 10.55;
        int p = 15;
        double k = 3;
        double output = RectangleArea.square(p, k);
        assertThat(output).isCloseTo(expected, offset(0.01));
    }

    @Test
    void whenP12K2Square10() {
        double expected = 8;
        int p = 12;
        double k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isCloseTo(expected, offset(0.01));
    }
}