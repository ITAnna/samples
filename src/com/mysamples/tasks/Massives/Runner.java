package com.mysamples.tasks.Massives;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mas = scanner.nextLine();
        double[] array = InOut.getArray(mas);
        InOut.printArray(array);
        InOut.printArray(array, "V", 3);
    }
}
