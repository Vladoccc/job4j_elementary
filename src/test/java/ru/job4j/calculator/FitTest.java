package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan187Then92() {
        short input = 180;
        double expected = 92;
        double outpud = Fit.manWeight(input);
        assertThat(outpud).isEqualTo(expected, withPrecision(0.01));
        }

    @Test
    void whenWoman170Then69() {
        short input = 170;
        double expected = 69;
        double outpud = Fit.womanWeight(input);
        assertThat(outpud).isEqualTo(expected, withPrecision(0.01));
    }
}