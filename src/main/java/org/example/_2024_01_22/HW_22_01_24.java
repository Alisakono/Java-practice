package org.example._2024_01_22;

public class HW_22_01_24 {

//    Вывести на экран “равнобедренный треугольник”, всё “рёбра”которого состоят
//    из единиц, “медиана” равна 14, а вся “площадь” заполнена нулями =)

        public static void main(String[] args) {
        System.out.println(1);
        long x = 1;
    int median = 14;
        for (int i = 2; i <= 2*median; i++) {
            System.out.println(x + "1");
            x *= 10;
            if (i == median) {
                x /= 10;
                for (i = median +2 ; i <= 2*median -1; i++) {
                    x /= 10;
                    System.out.println(x + "1");
                }
            }
        }
        System.out.println("1");
    }
}





