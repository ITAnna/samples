package com.mysamples.tasks.multiTableExample;

public class PrintMultiTable {
    static void printMultiTable(){
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%1d*%1d=%-2d ", i, j, i*j);
            }
            System.out.println();
        }
    }
}
