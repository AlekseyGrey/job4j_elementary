package ru.job4j.converter;

import org.assertj.core.api.Assertions;

class ConverterTest {

    @org.junit.jupiter.api.Test
    void whenConvert140RblThen2Euro() {
        int input = 140;
        int expected = 2;
        int output = Converter.rubleToEuro(input);
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @org.junit.jupiter.api.Test
    void whenConvert80000RblThen879Dollar() {
        int input = 80000;
        int expected = 879;
        int output = Converter.rubleToDollar(input);
        Assertions.assertThat(output).isEqualTo(expected);
    }
}