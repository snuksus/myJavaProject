package school.lesson1;

import javax.swing.*;

public class HomeWorkApp {
    public static void main (String[] args) {
        printThreeWords();
        checkSumThings();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumThings() {
        int a;
        int b;
        a = 1;
        b = 2;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value;
        value = 11;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }


    }
    public static void compareNumbers() {
        int a;
        int b;
        a = 3;
        b = 4;
        if (a >= b){
            System.out.println("a >=b");
        }
        else {
            System.out.println("a < b");
        }
    }

    }



