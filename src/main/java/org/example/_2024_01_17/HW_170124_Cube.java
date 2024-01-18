package org.example._2024_01_17;

import java.util.Scanner;

public class HW_170124_Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину ребра куба: ");
        int length = scanner.nextInt();
        double volume = Math.pow(length, 3);
        System.out.println("volume = " + volume);
    }
}
