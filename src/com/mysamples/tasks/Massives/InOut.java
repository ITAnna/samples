package com.mysamples.tasks.Massives;

public class InOut {
    static double[] getArray(String line) {
        String[] strArr = line.split(" ");
        double[] res = new double[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            res[i] = Double.parseDouble(strArr[i]);
        }
        return res;
    }

    static void printArray(double[] arr) {
        for (double elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    static void printArray(double[] arr, String name, int columnCount) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-8.4f", name, i, arr[i]);
            if ((i + 1) % columnCount == 0 || (i + 1) == arr.length) {
                System.out.println();
            }
        }
    }
}
