package com.mysamples.tasks.Massives;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mas = scanner.nextLine();
        double[] array = InOut.getArray(mas);
        double first = array[0];
        double last = array[array.length-1];
        InOut.printArray(array);
        InOut.printArray(array, "V", 3);
        //sort method will be realized here later
        Operations.sortMas(array);
    }
}
