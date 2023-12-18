package org.example;

public class Book {
   public static void main(String[] args) {

   String[] bookArr = new String[4];
   bookArr[0] = "Max, Heidelberg, 1991";
   bookArr[1] = "Java, Kofier, 2001";
   bookArr[2] = "Perfume, Getmam, 2014";
   bookArr[3] = "Welt, Peterson, 2020";
  for (int i = 0; i < 4; i++) {
      System.out.println(bookArr[i]);

   }
}}

//  Создайте класс Book с полями title, author и year. Затем создайте массив объектов
//   типа Book и заполните его несколькими книгами. Напишите метод, который принимает
//  массив книг в качестве параметра и выводит информацию о каждой книге.