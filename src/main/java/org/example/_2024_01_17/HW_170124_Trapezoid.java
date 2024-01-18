package org.example._2024_01_17;

import java.util.Scanner;

public class HW_170124_Trapezoid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int c = scanner.nextInt();
        System.out.println("Введите четвертое число: ");
        int d = scanner.nextInt();
        int perimeter = a + b + c + d;
        System.out.println("perimeter = " + perimeter);
    }
}
