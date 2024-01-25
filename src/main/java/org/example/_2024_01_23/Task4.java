package org.example._2024_01_23;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {12, 81, 55, 65, 15, 47, -21, -54, -14};
        System.out.println("Среднее арифметическое: " + getArNum(array));
        System.out.println("Это массив чисел, которые меньше ср.арефм.");
        System.out.println(Arrays.toString(minElem(array)));
    }

//    Найти среднее арифметическое от всех элементов массива
    public static int getArNum(int[] array) {
        int arNum = 0;
        int arSum = 0;
        for (int j : array) {
            arSum += j;
            arNum = arSum / array.length;

        }
        return arNum;
    }
//          Найти в массиве те элементы, значение которых меньше среднего арифметического,
//          взятого от всех элементов массива
    public static int[] minElem(int[] array) {
        int arNum = getArNum(array);
        int count = 0;
        for (int elem : array) {
            if (elem < arNum) {
                count++;
            }
        }
        int[] result = new int[count];
        int count1 = 0;
        for (int j : array) {
            if (j < arNum) {
                result[count1] = j;
                count1++;
            }
        }
        return result;
    }
}


