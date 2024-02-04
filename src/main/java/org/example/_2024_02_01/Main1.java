package org.example._2024_02_01;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        if (number < 0){
            System.out.println("Не правильно выбрано число");
        }
        FibonacciSequence fibonacciSequence = new FibonacciSequence(number);
        FibonacciSequence fibonacciSequence1 = new FibonacciSequence();
        fibonacciSequence.setNumber(number);
        System.out.println(fibonacciSequence.getNumber());
        System.out.println(Arrays.toString(fibonacciSequence.calculateFor()));
        System.out.println(Arrays.toString(fibonacciSequence.calculateDo()));
        System.out.println(Arrays.toString(fibonacciSequence.calculateWhile()));

    }
}



