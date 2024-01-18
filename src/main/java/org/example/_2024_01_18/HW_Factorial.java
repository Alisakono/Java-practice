package org.example._2024_01_18;

import java.util.Scanner;

public class HW_Factorial {
    public static int usFor(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int usDo(int num) {
        int fact = 1;
        int i = 1;
        do {
            fact = fact * i;
            i++;
        } while (i <= num);
            return fact;
        }

    public static int usWhile(int num) {
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(usFor(num));
        System.out.println(usDo(num));
        System.out.println(usWhile(num));
    }
}
