package org.example._2024_01_23;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {9, 5, 11, 4, 6};
        System.out.println("Максимальный элемент в массиве: " + maxNum(arr));

        System.out.println("Чётный индекс максимального элемента в массиве: " + maxIndex(arr));
    }

    //    В массиве найти максимальный элемент с четным индексом
    public static int maxNum(int[] arr) {
        int maxElem = arr[0];

        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] > maxElem) {
                maxElem = arr[i];
            }
        }
        return maxElem;
    }
    public static int maxIndex(int[] arr){
        int maxIndex = 0;
        for (int j = 1; j < arr.length; j++){
            if (arr[j] > arr[maxIndex]){
                maxIndex = j;
            }
        }
        return maxIndex;
    }

}

