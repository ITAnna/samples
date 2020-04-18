package com.mysamples.tasks.Lesson2;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        FindRoots(a, b, c);
    }

    private static void FindRoots(double a, double b, double c) {
        double dis = b*b - 4*a*c;
        if (dis < 0){
            System.out.println("No roots");
        }

        else if (dis == 0){
            double x = -b/(2*a);
            System.out.println(x);
        }

        else {
            double x1 =(-b + Math.sqrt(dis))/(2*a);
            double x2 = (-b - Math.sqrt(dis))/(2*a);
            System.out.println(x1 + " " + x2);
        }
    }
}
