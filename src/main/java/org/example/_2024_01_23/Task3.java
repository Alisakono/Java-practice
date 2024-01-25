package org.example._2024_01_23;

public class Task3 {
    public static void main(String[] args) {
        int[] myList = {9, 10, 11, 24, 54, -9, 21, -74, 22};
        System.out.println(getPlusSum(myList));
    }
//    В массиве, содержащем положительные и отрицательные целые числа,
//    вычислить сумму четных положительных элементов
    public static int getPlusSum(int[] myList){
        int sum = 0;
        for (int j : myList) {
            if (j > 0 && (j % 2 == 0)) {
                sum += j;
            }
        }
        return sum;
    }
}
