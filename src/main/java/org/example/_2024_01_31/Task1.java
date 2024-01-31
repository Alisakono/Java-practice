package org.example._2024_01_31;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку " + i + ":");
            strings[i] = scanner.next();
        }
        System.out.println(Arrays.toString(sortStringsByLengths(strings)));

        System.out.println(Arrays.toString(findLongShortStrings(strings)));

        System.out.println(Arrays.toString(middleLine(strings)));

    }
   /* 1. Ввести n строк с консоли, найти самую короткую и самую длинную строки.
    Вывести найденные строки и их длину.*/

    public static String[] findLongShortStrings(String[] strings) {
        String[] result = new String[2];
        int minLengths = strings[0].length();
        int maxLengths = strings[0].length();
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < minLengths) {
                minLengths = strings[i].length();
                minIndex = i;
            }
            if (strings[i].length() > maxLengths) {
                maxLengths = strings[i].length();
                maxIndex = i;
            }
        }
        result[0] = strings[minIndex] + " " + minLengths;
        result[1] = strings[maxIndex] + " " + maxLengths;
        return result;
    }
    /*2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке
   возрастания (убывания) значений их длины.*/
    public static String[] sortStringsByLengths(String[] strings1) {
        for (int i = 0; i < strings1.length; i++) {
            for (int j = 0; j < strings1.length - i - 1; j++) {
                if (strings1[j].length() > strings1[j + 1].length()) {
                    String temp = strings1[j];
                    strings1[j] = strings1[j + 1];
                    strings1[j + 1] = temp;
                }
            }
        }
        return strings1;
    }

     /*       3. Ввести n строк с консоли. Вывести на консоль те строки, длина
    которых меньше (больше) средней, а также длину.*/

    public static String[] middleLine(String[] lines) {
        String[] resUlt = new String[3];
        int midLineLength = lines[0].length();
        int minLineLength = lines[0].length();
        int maxLineLength = lines[0].length();
        int midIndex = 0;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].length() < minLineLength) {
                minLineLength = lines[i].length();
                minIndex = i;
            }
            if (lines[i].length() > maxLineLength) {
                maxLineLength = lines[i].length();
                maxIndex = i;
            }
            if (midLineLength == (minLineLength + maxLineLength) / 2) {
                midLineLength = lines[i].length();
                midIndex = i;
            }
        }
        resUlt[0] = lines[minIndex] + " " + minLineLength;
        resUlt[1] = lines[midIndex] + " " + midLineLength;
        resUlt[2] = lines[maxIndex] + " " + maxLineLength;

        return resUlt;
    }
}