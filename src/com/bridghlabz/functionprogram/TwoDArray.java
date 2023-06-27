package com.bridghlabz.functionprogram;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        System.out.println(" Enter number of column:");
        Scanner sc = new Scanner(System.in);
        int column = sc.nextInt();
        System.out.println(" Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println(" Enter array element:");
        int arr[][] = new int[rows][column];
        System.out.println("\n enter " +(rows*column)+" array element ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println("array is = ");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
