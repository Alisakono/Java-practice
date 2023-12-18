package Lernen2;

import java.util.Random;
import java.util.Scanner;

public class lernen2 {
    public static void main(String[] args) {
//        Random random = new Random();
//        int sum = 0;
//        while (sum<=1000000){
//            int donat = random.nextInt(1,101);
//            int tax = random.nextInt(5,11);
//            sum = sum +(donat-(donat*tax/100));
//        }
//        System.out.println(sum);

//        Scanner scanner = new Scanner(System.in);
//        int user = scanner.nextInt();
//        int del = 0;
//        for (del = 1; del < user; del++) {
//            if (user % del == 0) {
//               if (user / del < del)
//                    System.out.println(del);
//            }
//        }
//        Используйте foreach. Создайте перечисление
//        элементов мебели (кровать, стул, стол, шкаф, тумба и т.д.).
//        Выведите все элементы мебели,
//        кроме тех, на которых принято сидеть

       Furniture sid = Furniture.CHAIR;
        Furniture sid1 = Furniture.BED;
        Furniture sid2 = Furniture.BENCH;
        Furniture sid3 = Furniture.SOFA;
        Furniture sid4 = Furniture.TABLE;
        System.out.print(sid+",");
        System.out.print(sid1+",");
        System.out.print(sid2+",");
        System.out.print(sid3+",");
        System.out.println(sid4);

        System.out.println(java.util.Arrays.asList(Furniture.values()));
        System.out.println(Furniture.CHAIR);


    }
}


//
//    Необходимо найти максимальный делитель числа, введённого пользователем.
//////    Программу повторять, пока пользователь не введёт «stop».
