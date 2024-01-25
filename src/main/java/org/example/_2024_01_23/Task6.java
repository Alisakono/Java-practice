package org.example._2024_01_23;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 6, 9, -5, 8, -7};
        System.out.println("Два наименьших элемента: " + Arrays.toString(minNumb(arr)));
        System.out.println("Сумма модулей элементов массива: " + sumMod(arr));
        System.out.println("Номер минимального по модулю элемента массива: " + minMod(arr));
    }

    //    В массиве целых чисел определить два наименьших элемента. Они могут быть как равны
//    между собой (оба являться минимальными), так и различаться
    public static int[] minNumb(int[] arr) {
        int minNum1 = arr[0];
        int minNum2 = arr[0];
        for (int j : arr) {
            if (j < minNum1) {
                minNum2 = minNum1;
                minNum1 = j;
            }
            else if (j <= minNum2) {
                minNum2 = j;
            }
        }

        return new int[]{minNum1, minNum2};
    }

    //    Вычислить сумму модулей элементов массива
    public static int sumMod(int[] arr) {
        int sum = 0;
        for (int elem : arr) {
            sum += Math.abs(elem);
        }
        return sum;
    }

    //    Найти номер минимального по модулю элемента массива
    public static int minMod(int[] arr) {
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
                if (Math.abs(arr[i]) < Math.abs(arr[min])) {
                    min = i;
                }
            }
            return min;
        }}







