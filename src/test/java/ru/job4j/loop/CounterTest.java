package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void when0To5Then15() {
        int start = 0;
        int finish = 5;
        int result  = Counter.sum(start, finish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when0To10Then55() {
        int start = 0;
        int finish = 10;
        int result  = Counter.sum(start, finish);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when3To8Then36() {
        int start = 3;
        int finish = 8;
        int result  = Counter.sum(start, finish);
        int expected = 36;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when1To1Then2() {
        int start = 1;
        int finish = 1;
        int result  = Counter.sum(start, finish);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when5To0Then0() {
        int start = 5;
        int finish = 1;
        int result  = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}