package com.mysamples;

public class MasBubbleSorting {

    private int mas[] = new int[10]; //massive with 10 elements initialized and filled with "0"-s by default

    private void fillMas() { //the method created

        for (int element : mas) {
            element = ((int) (Math.random() * 8) * 8); //massive filled with random numbers
            System.out.print(element + " "); //massive elements printed
        }
        System.out.print("- this is unsorted massive");

    }

    private void sortMas() { //the method created
        for (int i = 0; i < mas.length; i++) {
         
        }
    }

    public static void main(String[] args) {
        MasBubbleSorting mas = new MasBubbleSorting();
        mas.fillMas(); //the filling method is invoked
        mas.sortMas(); //the sorting method is invoked
    }

}
