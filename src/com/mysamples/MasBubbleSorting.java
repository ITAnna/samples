package com.mysamples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MasBubbleSorting {

    private int mas[] = new int[10]; //massive with 10 elements initialized and filled with "0"-s by default

    private void fillMas() { //the method created

//        for (int element : mas) {
//            element = ((int) (Math.random() * 8) * 8); //massive filled with random numbers
//            System.out.print(element + " "); //massive elements printed
//        } //does not work properly as foreach cycle does not rewrite the massive

        for (int i = 0; i < mas.length; i++) {
            mas[i] = ((int) (Math.random() * 8) * 8); //massive filled with random numbers
            System.out.print(mas[i] + " "); //massive elements printed
        }
        System.out.print("- this is unsorted massive");
    }


    private void sortMas() { //the method created
        boolean swap; //flag set to false by default
        int last = mas.length - 1; //last checked element is smaller cause it is compared with last element
        do {
            swap = false;
            int buffer; //temporary int to change 2 elements places
            for (int i = 0; i < last; i++) {
                if (mas[i] > mas[i + 1]) { //the condition to replace elements: if next element is smaller, then replace
                    buffer = mas[i]; //save the element
                    mas[i] = mas[i + 1]; //the smaller element take the previous place
                    mas[i + 1] = buffer; //the saved element take the next place
                    swap = true; //if some elements has been replaced, the flag becomes true, if doesn't then it stays in the false stage and cycle stops.
                }
            }
            last--; //because maximum element always takes the last place
        } while (swap == true);
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            System.out.print(" "+ mas[i] + " "); //here we print the sorted massive elements
        }
        System.out.print("The massive is sorted in ascending order");
    }


    public static void main(String[] args) {
        MasBubbleSorting mas = new MasBubbleSorting();
        mas.fillMas(); //the filling method is invoked
        mas.sortMas(); //the sorting method is invoked
    }

}
