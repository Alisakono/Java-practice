package org.example._2024_02_01;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Не правильно выбрано число");
        }
        Factorial factorial = new Factorial(number);
        Factorial factorial1 = new Factorial();

        factorial.setNumber(number);
        System.out.println(factorial.getNumber());

        System.out.println(factorial.usFor());
        System.out.println(factorial.usDo());
        System.out.println(factorial.usWhile());

    }
}
