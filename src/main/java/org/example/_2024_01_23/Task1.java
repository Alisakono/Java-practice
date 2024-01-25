package org.example._2024_01_23;

public class Task1 {
    public static void main(String[] args) {
//        В массиве найти максимальный элемент
        int[] array = {2, 6, 8, 10, 12, 9, 15};
        System.out.println(maxNum(array));
    }
    public static int maxNum(int[] array){

        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
