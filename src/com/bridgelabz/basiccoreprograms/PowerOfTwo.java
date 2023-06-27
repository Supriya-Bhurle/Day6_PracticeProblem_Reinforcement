package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  number: ");
        int Number= scanner.nextInt();
        System.out.print("Enter the  power: ");
        int Power= scanner.nextInt();
        int Reasult= calculationMethod(Number,Power);
        System.out.println(Number + "^" + Power + "=" + Reasult);
    }
    static int calculationMethod(int Number,int Power){
        int Reasult=1;
        for (int i=1;i<=Power;i++){
            Reasult=Reasult*Number;
        }
        return Reasult;
        }
    }

