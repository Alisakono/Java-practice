package org.example._2024_01_18;

import java.util.Scanner;

public class HW_Factorial {
    public static int usFor(int x) {
        int fact1 = 1;
        for (int i = 1; i <= x; i++) {
            fact1 = fact1 * i;
        }
        return fact1;
    }

    public static int usDo(int y) {
        int fact2 = 1;
        int i = 1;
        do {
            fact2 = fact2 * i;
            i++;
        } while (i <= y);
        {
            return fact2;
        }
    }

    public static int usWhile(int z) {
        int fact3 = 1;
        int i = 1;
        while (i <= z) {
            fact3 = fact3 * i;
            i++;
        }
        return fact3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(usFor(num));
        System.out.println(usDo(num));
        System.out.println(usWhile(num));
    }
}
