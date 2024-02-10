package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (symbol == input.charAt(i + 1)) {
                counter++;
            } else if (counter == 1) {
                result = result + symbol;
                symbol = input.charAt(i + 1);
            } else {
                result = result + symbol + counter;
                symbol = input.charAt(i + 1);
                counter = 1;
            }
        }
        result = counter == 1 ? result + symbol : result + symbol + counter;
        return result;
    }
}
