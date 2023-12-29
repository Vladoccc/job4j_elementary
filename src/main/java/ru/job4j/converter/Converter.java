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
        float input2 = 120;
        float expected2 = 2;
        float outpud2 = Converter.rubleToDollar(input2);
        boolean passed2 = expected2 == outpud2;
        float input3 = 100;
        float expected3 = 116;
        float outpud3 = Converter.euroToDollar(input3);
        boolean passed3 = expected3 == outpud3;
        float input4 = 100;
        float expected4 = 85;
        float outpud4 = Converter.dollarToEuro(input4);
        boolean passed4 = expected4 == outpud4;
        System.out.println("140 rubles are 2 euro. Test result : " + passed1);
        System.out.println("120 rubles are 2 dollar. Test result : " + passed2);
        System.out.println("100 euro are 116 dollar. Test result : " + passed3);
        System.out.println("100 dollar are 85 euro. Test result : " + passed4);
    }
}
