package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static  float rubleToDollar(float value) {
        float result = value / 60;
        return  result;
    }

    public static float euroToDollar(float value) {
        float result  = value * 1.16F;
        return result;
    }

    public static float dollarToEuro(float value) {
        float result = value * 0.85F;
        return result;
    }

    public static void main(String[] args) {
        float input1 = 140;
        float expected1 = 2;
        float outpud1 = Converter.rubleToEuro(input1);
        boolean passed1 = expected1 == outpud1;
        System.out.println("140 rubles are 2 euro. Test result : " + passed1);
        input1 = 120;
        outpud1 = Converter.rubleToDollar(input1);
        passed1 = expected1 == outpud1;
        System.out.println("120 rubles are 2 dollar. Test result : " + passed1);
        input1 = 100;
        expected1 = 116;
        outpud1 = Converter.euroToDollar(input1);
        passed1 = expected1 == outpud1;
        System.out.println("100 euro are 116 dollar. Test result : " + passed1);
        input1 = 100;
        expected1 = 85;
        outpud1 = Converter.dollarToEuro(input1);
        passed1 = expected1 == outpud1;
        System.out.println("100 dollar are 85 euro. Test result : " + passed1);
    }
}
