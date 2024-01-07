package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchWeekTest {

    @Test
    void when1ThenMonday() {
        int day = 1;
        String result =  SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when4ThenTuesday() {
        int day = 4;
        String result =  SwitchWeek.nameOfDay(day);
        String expected = "Четверг";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when8ThenMonday() {
        int day = 8;
        String result =  SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        assertThat(result).isEqualTo(expected);
    }
}