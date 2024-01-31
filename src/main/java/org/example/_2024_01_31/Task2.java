package org.example._2024_01_31;

import java.util.Scanner;

public class Task2 {
    /* 4. Ввести число от 1 до 12. Вывести на консоль название месяца,
   соответ-ствующего данному числу.(Осуществить проверку корректности
   ввода чисел).*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12: ");
        int num = scanner.nextInt();
        System.out.println(monNumb(num));
    }

    public static String monNumb(int num) {
        String[] strings = {"Январь", "Февраль", "Март", "Апрель", "Май",
                "Июнь", "Июль", "Авгусе", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
            if (num < 1 || num > 12) {
                return "Вы ввели не правильное число";
            }
        return strings[num-1];
    }
}




