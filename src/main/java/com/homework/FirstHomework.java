package com.homework;

public class FirstHomework {
    public static void main(String[] args) {

        // задание 2
        byte byte1 = (byte) 50;
        short short1 = (short) 100;
        int int1 = 200;
        long long1 = 300;
        float float1 = 2.5f;
        double double1 = 3.5;
        char char1 = 'f';
        boolean boolean1 = true;
        boolean boolean2 = false;

        float a = 5.5f;
        float b = 1.1f;
        float c = 1.6f;
        float d = 4.3f;
        System.out.println(calculate(a, b, c, d));

        int x = 3;
        int y = 2;
        System.out.println(task10and20(x, y));

        int x1 = -4;
        isPositiveOrNegative(x1);

        int y1 = 7;
        System.out.println(isNegative(y1));

        String name = "Ольга";
        greetings(name);
    }

    // задание 3
    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // задание 4
    public static boolean task10and20(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // задание 5
    public static void isPositiveOrNegative(int x1) {
        if(x1 >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // задание 6
    public static boolean isNegative(int y1) {
        if (y1 <= 0) {
            return true;
        } else {
            return false;
        }
    }

    // задание 7
    public static void greetings(String name) {
        System.out.println("Привет, " + name);
    }
}
