package com.bridghlabz.functionprogram;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value :");
        int a = sc.nextInt();
        System.out.println("Enter second value :");
        int b = sc.nextInt();
        System.out.println("Enter third value :");
        int c = sc.nextInt();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double first = (-b + Math.pow(d,0.56)) / ( 2 * a);
            double second = (-b - Math.pow(d,0.56)) / ( 2 * a);
            System.out.println("The roots are " + first );
        } else if (d == 0){
            double first = ( -b)/(2 * a);
            System.out.println("The roots is " + first);
        }else {
            System.out.println("The roots is not real" );
    }
}}
