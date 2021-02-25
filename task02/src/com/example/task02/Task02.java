package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long inputNum = Long.parseLong(input);

        //inputNum >= -2^7 && inputNum <= (2^7)-1
        if (inputNum >= -((long) Math.pow(2, 7)) && inputNum <= ((long) Math.pow(2, 7) - 1))
            return "byte";
        else if (inputNum >= -((long) Math.pow(2, 15)) && inputNum <= ((long) Math.pow(2, 15) - 1))
            return "short";
        else if (inputNum >= -((long) Math.pow(2, 31)) && inputNum <= ((long) Math.pow(2, 31) - 1))
            return "int";
        else return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
