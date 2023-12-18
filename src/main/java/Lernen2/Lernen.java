package Lernen2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import static java.lang.Integer.*;

public class Lernen {
    public static void main(String[] args) {
//        del();
//        Напишите программу на Java, которая использует цикл while для вычисления суммы чисел от 1 до 100.

//        int i = 1;
//        int sum = 0;
//        while (i <= 100) {
//            sum += i;
//            i++;
//
//        }
//        System.out.println(sum);
//        Напишите программу на Java, которая использует цикл for для нахождения максимального числа в массиве целых чисел.

//        int[] arr = {3, 5, 8, 9, 41, 69, 54, 21, 32, 74};
//        int max = arr [0];
//        for (int i : arr) {
//            if (i > max) {
//                max = i;
//            }
//        }
//        System.out.println(max);
////        int max = Arrays.stream(arr).max().getAsInt();

//        Напишите программу на Java, которая использует цикл while для проверки, является ли число простым.

//      }private boolean checkIfPrimeNumber(int number) {
//
//            if (number < 2) {
//                return false;
//            }
//        int number1 = 5;
//            int sqrt = (int) Math.sqrt(number);
//            for (int i = 2; i <= sqrt; i++) {
//                if (number % i == 0) {
//                    return false;
//
//                }
//            }
//            return true;


//      int i = 1;
//      while (i<13){
//          i++;
//          if (isPrime(i)){
//              System.out.println(i);
//          }
//      }
//       }
//        int j = 1;
//        while (j<19){
//            j+=2;
//            if (j/2 !=0){
//                if (j%2 !=0){
//                    if (j==9){
//                    continue;
//                }
//            }
//            System.out.println(j);
//        } }}}
//       Напишите программу на Java, которая использует цикл for для вывода первых 10 чисел Фибоначчи.
//       for (i = 0; i <=10; i++){
//           System.out.println(i);

        // Set it to the number of elements you want in the Fibonacci Series
//                   int maxNumber = 10;
//                   int previousNumber = 1;
//                   int nextNumber = 1;
//                   System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
//                   for (int i = 1; i <= maxNumber; ++i)
//                   {
//                       System.out.print(previousNumber+" ");
//                       /* On each iteration, we are assigning second number
//                        * to the first number and assigning the sum of last two
//                        * numbers to the second number
//                        */
//
//
//                       int sum = previousNumber + nextNumber;
//                       previousNumber = nextNumber;
//                       nextNumber = sum;
//                   }

//         Напишите программу на Java, которая использует цикл while для вычисления факториала числа 5.
        int i = 1;
        int sam = 1;
        while (i <= 5) {
            sam *=i;
            System.out.println(sam);
            i++;
        }
    }}
//        Напишите программу на Java, которая использует цикл for для проверки, являются ли два
//        числа взаимно простыми.
//            int a = 0;
//            int b = 0;
//            for (int i = 0; i>=a; i++){
//                for (int j = 0; j>=b; j++){
//        Напишите программу на Java, которая использует цикл while для вывода всех чисел от 1 до N
//        , которые делятся
//    на 3 без остатка.
//        int k = 1;
//        while (k<10){
//        k++;
//        if (k % 3 ==0){
//        System.out.println(k);
//    }
//}
//        Напишите программу на Java, которая использует цикл for для нахождения суммы цифр числа N.
//        int n = 654;
//        for (int i = 0; i<=n; i++){
//        }
//        System.out.println((n %10)+(n/10)%10+(n/100));
//        int n = 1236;
//        int sum = 0;
//        for ( ; n > 0; n /= 10){
//            sum += n % 10;
//}
//        System.out.println(sum);
//        Напишите программу на Java, которая использует цикл while для определения, является
//        ли число N палиндромом.
//        String numStr = Integer.toString(int num);
//        int a = 0;
//        int d = numStr.length() - 1;
//        while (a<d){
//            if (numStr.charAt(a) != numStr.charAt(d)){
//                return;
//            }
//            a++;
//            d--;
//        }
//        Напишите программу на Java, которая использует цикл for для вывода всех делителей числа N.
//        int n = 100;
//        for (int i = 1; i <= n; i++){
//           if (n%i ==0){
//               System.out.println(i);
//           }
//        }
//        Создайте программу на Java, которая использует вложенные циклы
//                (for и while) для печати всех делителей числа 21.

//        int n = 21;
//        int i = 1;
//           while (i<=n){
//               i++;
//               if (n%i == 0){
//                   System.out.println(i);
//           }
//                }
//        Напишите программу на Java, которая использует цикл for для вывода первых 12 квадратов целых чисел.

        //        for (int i = 1; i <= 12; i++){
//                System.out.println(i*i);
//            }
//
//        }
//        Используйте цикл while для подсчета количества четных чисел между 1 и 26.
//
//        int num = 0;
//        for(int i = 1; i<= 26; i++) {
//            if (i % 2 == 0) {
//                num = num + 1;
//            }
//        }
//        System.out.println(num);
//
//    } Создайте программу на Java, которая использует вложенные циклы
//    (for и while) для печати всех делителей числа 24.

//        int n = 24;
//        for (int i = 1; i <= n; i++) {
//        if (n%i ==0){
//            System.out.println(i);
//            }
//        }
//        Напишите программу на Java, которая использует цикл for для вывода первых 15 квадратов целых чисел.
//        for (int i = 1; i<=15; i++){
//            System.out.println(i*i);
//        }
//        Используйте цикл while для подсчета количества четных чисел между 1 и 32.
//        int i = 1;
//        int num = 0;
//        while (i <= 32) {
//            if (i % 2 == 0) {
//                num = num + 1;
//            }
//            i++;
//        }
//        System.out.println(num);

//
//    }
//    public static void del(){
//        for (int i = 1; i<=27; i++){
//            if (27%i == 0){
//                System.out.println(i);
//            }
//        }
//Создайте программу на Java, которая использует вложенные циклы (for и while)
//    для печати всех делителей числа 27.
//        Используйте цикл while для подсчета количества четных чисел между 1 и 38.
//        int i = 1;
//        int num = 0;
//        while (i <= 38) {
//        if (i%2 == 0){
//            num = num + 1;
//        }
//            i++;
//        }
//        System.out.println(num);
//        Создайте программу на Java, которая использует вложенные циклы
//                (for и while) для печати всех делителей числа 30.
//        int num = 30;
//        for (int i = 1; 30 >= i; i++){
//            while (0 == num % i){
//                System.out.println(i);
//                i++;
//            }
//        }
//        Напишите программу на Java, которая использует цикл for для вывода первых 21 квадратов целых чисел.
//    for (int j =1; j <= 21; j++ ){
//        System.out.println(j*j);
//    }
////        Используйте цикл while для подсчета количества четных чисел между 1 и 44.
//        int i = 1;
//        int n = 0;
//        while (i<=44){
//        if (i % 2 == 0){
//           n += 1;
//        }
//            i++;
//    }
//        System.out.println(n);
//        Создайте программу на Java, которая использует вложенные циклы
//                (for и while) для печати всех делителей числа 33
//        int num = 33;
//        for (int k = 1; k <= num; k++) {
//            while (num % k == 0) {
//                System.out.println(k);
//                k++;
//            }
//        }
////        Напишите программу на Java, которая использует цикл for для вывода первых 24 квадратов целых чисел.
//        for (int i = 1; i<= 24; i++){
//            System.out.println(i*i);
//        }
//    Используйте цикл while для подсчета количества четных чисел между 1 и 50.
//    int i1 = 1;
//    int num1 = 0;
//    while (i1<=50){
//        if (i1%2==0){
//            num1 = num1 + 1;
//        }
//       i1++;
//    }
//        System.out.println(num1);
//        Создайте программу на Java, которая использует вложенные циклы
//                (for и while) для печати всех делителей числа 36
//        int num = 36;
//        for (int j =1; j<= num; j++){
//            while (num%j ==0){
//                System.out.println(j);
//                j++;
//            }
//
//        }
//        Напишите программу на Java, которая использует цикл for для вывода первых 27 квадратов целых чисел
//
//        for (int i = 1; i<= 27; i++){
//            System.out.println(i*i);
//        }
//        Используйте цикл while для подсчета количества четных чисел между 1 и 56
//        int i = 1;
//        int col = 0;
//        while (i<=56){
//            i++;
//            if (i%2 == 0){
//                col += 1;
//            }
//        }
//        System.out.println(col);

//        Создайте программу на Java, которая использует вложенные
//        циклы (for и while) для печати всех делителей числа 39

//        int num = 39;
//        for (int i = 1; i<= num; i++){
//            while (num%i==0){
//                System.out.println(i);
//                i++;
//            }
//        }
//        Напишите программу на Java, которая использует цикл for для вывода первых 30 квадратов целых чисел.
//        for (int j = 1; j <= 30; j++){
//            System.out.println(j*j);
//    }



//             int donat = random.nextInt(1, 101);
//             int tax = random.nextInt(5, 10);
//
//
//             sum =sum +(donat*tax)/100;
//        }           System.out.println(sum);
//
//
//    }}
////    Необходимо найти максимальный делитель числа, введённого пользователем.
////    Программу повторять, пока пользователь не введёт «stop».
//}





















