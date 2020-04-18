package com.mysamples.tasks.Lesson2;

public class PrintNumbersExample {
    public static void main(String[] args) {
        PrintNumbers();
    }

    private static void PrintNumbers() {
        for (int i = 1; i <= 25; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
            else if (i < 10) {
                System.out.print(" ");
            }
        }
    }
}
