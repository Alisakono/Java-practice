package org.example;

import animal.animal.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setTail(10);
        dog.tail = 10.0;
        System.out.println(dog.setTail(-10));
        dog.cutTail();
        for (int i = 0; i<20; i++);
        dog.cutTail();
        System.out.println(dog.getTail());
    }
}


