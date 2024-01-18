package org.example._2024_01_18;

import java.util.Scanner;

public class HW_180124_UsDo {
    //    написать программу, которая принимает в качестве аргумента число.
//    программа должна рассчитать факториал этого числа.используя
//    цикл
    public static void main(String[] args) {
        usDo();
    }

    public static void usDo() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int fact = 1;
        int i = 1;
        do {
            System.out.println(fact);
            i++;
            fact = (fact * i);
        } while (i <= num);
    }
}
