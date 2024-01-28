package org.example._2024_01_25;

import java.util.Scanner;

public class HW_25_01_24 {

    /*    написать программу, которая принимает от пользователя целое число n.
    программа должна посчитать и вывести n чисел Фибоначчи.

    написать 3 варианта реализации ('3 метода'):
            1.используя цикл while
            2.используя цикл do-while
            3.используя цикл for

    Пример: ввод пользователя 9 -> вывод [0, 1, 1, 2, 3, 5, 8, 13, 21],
    ввод пользователя 5 -> вывод [0, 1, 1, 2, 3]*/


    public static class Fibonacci {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите целое число n: ");
            int n = scanner.nextInt();
            System.out.println("Числа Фибоначчи: ");

            fibonacciF(n);
            System.out.println(" ");
            fibonacciW(n);
            System.out.println(" ");
            fibonacciD(n);

        }
    }
    public static void fibonacciF(int n) {
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

    }
    public static void fibonacciW(int n) {
        int num1 = 0;
        int num2 = 1;
        int j = 0;
        while (j < n) {
            System.out.print(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            j++;
        }
    }
    public static void fibonacciD(int n) {
        int num1 = 0;
        int num2 = 1;
        int k = 0;
        do {
            System.out.print(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            k++;
        } while (k < n);
    }
}







