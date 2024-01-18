package org.example._2024_01_17;

import java.util.Scanner;

public class HW_170124_Sphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину радиуса: ");
        double radius = scanner.nextDouble();
        double square1 = (4 * Math.PI * radius*radius);
        System.out.println("square1 = " + Math.floor(square1));
    }
}
