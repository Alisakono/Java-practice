package org.example._2024_01_18;

import java.util.Scanner;

public class HW_180124_UsFor {
    public static void main(String[] args) {
        usFor();
    }

    public static void usFor() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int fact1 = 1;
        for (int j = 1; j <= num; j++) {
            fact1 = fact1 * j;
            System.out.println(fact1);
        }
    }
}
