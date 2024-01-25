package org.example._2024_01_24;

public class Task4 {
    //    Отсортировать массив целых чисел по возрастанию и по убыванию
//            (2 отдельных метода), не используя Arrays.sort()
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Исходный массив:");
        printArray(array);

        selectionSortDescending(array);
        System.out.println("\nОтсортированный массив по убыванию:");
        printArray(array);

        System.out.println("\nИсходный массив:");
        printArray(array);

        System.out.println("\nОтсортированный массив по возрастанию:");
       selectionSortAscending(array);
       printArray(array);
    }

    static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // Находим максимум в оставшейся части массива
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Меняем найденный максимум с текущим элементом
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    static void selectionSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // Находим минимум в оставшейся части массива
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Меняем найденный минимум с текущим элементом
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}



