package org.example._2024_02_01;

public class Factorial {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Factorial() {
    }

    public Factorial(int number) {
    }

    public int usFor() {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public int usDo() {
        int fact = 1;
        int i = 1;
        do {
            fact = fact * i;
            i++;
        } while (i <= number);

        return fact;
    }

    public int usWhile() {
        int fact = 1;
        int i = 1;
        while (i <= number) {
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
