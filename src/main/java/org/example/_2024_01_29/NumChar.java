package org.example._2024_01_29;

public class NumChar {
//    / 3.	Сформировать строку из 10 символов. На четных позициях должны находится
    //    четные цифры, на нечетных позициях - буквы.
        public static void main(String[] args) {
            String string2 = "orange654321";
            System.out.println(string2);
            String result = getNumChar(string2);
            System.out.println(result);
        }

        public static String getNumChar(String string2) {
            StringBuilder builder = new StringBuilder();
           String numbers = string2.substring(string2.length()/2);
           int index = 0;

            for (int i = 0; i < string2.length(); i++) {
                if (i % 2 == 0) {
                  builder.append(string2.charAt(index));
                } else {
                   builder.append(numbers.charAt(index));
                   index++;
            }


        }
            return builder.toString();
        }}



