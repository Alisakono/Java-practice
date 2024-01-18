package org.example._2024_01_18;

import java.util.Scanner;

public class HW_180124_UsWhile {
    public static void main(String[] args) {
        usWhile();
    }

    public static void usWhile() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int fact = 1;
        int i = 1;
        while (i < num) {
            i++;
            System.out.println(fact = fact * i);

        }
    }
}
