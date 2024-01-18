package org.example._2024_01_17;

import java.util.Scanner;

public class HW170124_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту треугольника: ");
        int height = scanner.nextInt();
        System.out.println("Введите длину стороны треугольника: ");
        int line = scanner.nextInt();
        int square = (height * line) / 2;
        System.out.println("square = " + square);
    }
}
