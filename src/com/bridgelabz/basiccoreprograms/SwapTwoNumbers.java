package com.bridgelabz.basiccoreprograms;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 20, b = 40;

        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int swap = a;
        a = b;
        b = swap;

        System.out.println("After swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
