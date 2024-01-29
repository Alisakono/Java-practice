package org.example._2024_01_25;

import java.util.Arrays;
import java.util.Scanner;

public class HW_FibonacciDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число n: ");
        int n = scanner.nextInt();
        System.out.println("Числа Фибоначчи: ");
        System.out.println(Arrays.toString(fibonacciD(n)));
    }

    public static int[] fibonacciD(int n) {
        int[] fibonacci = new int[n];
        int i = 2;
        if (n > 1) {
            fibonacci[1] = 1;
        }
        do {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        } while (i < n);
        return fibonacci;
    }
}
