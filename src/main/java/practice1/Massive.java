package practice1;

import java.util.Arrays;

public class Massive {
    public static void main(String[] args) {
        int[] rar = {5, 7, 9, 11, 3, 15};
//        System.out.println(Arrays.toString(rar));
        boolean arf = arifPro(rar);


        int[] array = {9, 12, 7, 85, 5, 47, 7};
        System.out.println(Arrays.toString(array));
        twoMaxNum(array);

    }

    //    Найти второй по величине элемент в массиве.
    public static void twoMaxNum(int[] arr) {
        int num1 = arr[0];
        int num2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num1) {
                num2 = num1;
                num1 = arr[i];
            }
            else if (arr[i] > num2 && arr[i] != num1) {
                num2 = arr[i];
            }
        }
        System.out.println(num1);
        System.out.println(num2);
    }

    //    Определить, образуют ли элементы массива арифметическую прогрессию.м
    private static boolean arifPro(int[] ar) {
        int d = ar[1] - ar[0];
        for (int j : ar) {
            if (j < ar.length - 1) {
                if ((ar[j += 1] - ar[j - 1]) != d) {
                    return false;
                }
            }
            System.out.println(false);
            return false;
        }
        System.out.println(true);
        return true;
    }}
//    int[] ar1 = {2, 4, 6, 8, 10, 12, 14};
//        if (arithPr(ar1)) {
//                System.out.println(true);
//                }else {
//                System.out.println(false);
//public static boolean arithPr(int[] ario) {
//
//        int n = ario[1] - ario[0];
//        for (int i = 2; i < ario.length; i++) {
//        if (ario[i] - ario[i - 1] != n) {
//        return false;
//        }
//        }
//        return true;
//
//        }
//public static boolean arithPr(int[] ario) {





//    Переставить элементы массива в обратн  ом порядке.
//        Найти второй по величине элемент в массиве.
//        Определить, образуют ли элементы массива арифметическую прогрессию.
//        Подсчитать сумму элементов массива, стоящих на нечетных позициях.
//        Найти количество уникальных элементов в массиве.
//        Определить, все ли элементы массива положительные.
//        Вывести элементы массива, которые делятся на 3 без остатка.
//        Найти разность между максимальным и минимальным элементами массива.
//        Определить, есть ли в массиве элемент, равный его порядковому номеру.
//        Поменять местами первый и последний элементы массива.
//        Вывести элементы массива, которые меньше их предыдущего элемента.