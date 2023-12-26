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
        float result  = value * 0.85F;
        return result;
    }

    public static float dollarToEuro(float value) {
        float result = value * 1.16F;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(70);
        float dollar = Converter.rubleToDollar(60);
        float euro1 = Converter.euroToDollar(10);
        float dollar1 = Converter.dollarToEuro(10);
        System.out.println("70 rubles are " + euro + " euro. ");
        System.out.println("60 rubles are " + dollar + " dollar. ");
        System.out.println("10 euro are " + dollar1 + " dollar. ");
        System.out.println("10 dollar are " + euro1 + " euro. ");
    }
}
