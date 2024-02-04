package org.example._2024_02_01;

public class FibonacciSequence {
    private int number;
    public FibonacciSequence(int number) {
        this.number = number;
    }

    public FibonacciSequence() {
    }
    public int[] calculateFor() {
        int n = number;
        int[] fibonacci = new int[n];
        if (n > 0) {
            fibonacci[0] = 0;
        }
        if (n > 1) {
            fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        return fibonacci;
    }

    public int[] calculateDo() {
        int n = number;
        int[] fibonacci = new int[n];
        int i = 2;
        if (n > 1) {
            fibonacci[1] = 1;
        }
        do {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        } while (i < n);
        return fibonacci;
    }

    public int[] calculateWhile() {
        int n = number;
        int[] fibonacci = new int[n];
        if (n > 1) {
            fibonacci[1] = 1;
            int i = 2;
            while (i < n) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                i++;
            }
        }
        return fibonacci;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}



