package ru.job4j.converter;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float input1 = 140;
        float expected1 = 2;
        float output1 = Converter.rubleToEuro(input1);
        float value = 0.0001f;
        assertThat(output1).isEqualTo(expected1, withPrecision(value));
    }

    @Test
    void whenConvert120RblThen2Dollar() {
        float input1 = 120;
        float expected1 = 2;
        float output1 = Converter.rubleToDollar(input1);
        float value = 0.0001f;
        assertThat(output1).isEqualTo(expected1, withPrecision(value));
    }

    @Test
    void whenConvert100EuroThen116Dollar() {
        float input1 = 100;
        float expected1 = 116;
        float output1 = Converter.euroToDollar(input1);
        float value = 0.0001f;
        assertThat(output1).isEqualTo(expected1, withPrecision(value));
    }

    @Test
    void whenConvert100DollarThen85Euro() {
        float input1 = 100;
        float expected1 = 85;
        float output1 = Converter.dollarToEuro(input1);
        float value = 0.0001f;
        assertThat(output1).isEqualTo(expected1, withPrecision(value));
    }

    @Test
    void main() {
    }
}