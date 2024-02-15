package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To2Then4() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To6To7Then7() {
        int left = 5;
        int right = 6;
        int first = 7;
        int result = Max.max(5, 5, 7);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To7To3To9Then9() {
        int left = 6;
        int right = 7;
        int first = 3;
        int second = 9;
        int result = Max.max(5, 5, 7, 9);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}