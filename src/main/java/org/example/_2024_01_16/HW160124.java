package org.example._2024_01_16;

public class HW160124 {
    public static void main(String[] args) {
//        Площадь треугольника
        int height = 11;
        int line = 14;
        int square = (height * line) / 2;
        System.out.println("square = " + square);

//        Объём куба
        int length = 10;
        double volume = Math.pow(length, 3);
        System.out.println("volume = " + volume);

//        Периметр трапеции
        int a = 6;
        int b = 7;
        int c = 3;
        int d = 9;
        int perimeter = a + b + c + d;
        System.out.println("perimeter = " + perimeter);

//        Площадь сферы
        double radius = 5;
        double square1 = (4 * Math.PI * radius);
        System.out.println("square1 = " + square1);
    }
}
