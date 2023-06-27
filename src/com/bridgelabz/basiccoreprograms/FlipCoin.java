package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number of times you want to flip the coin :");
        double num = sc.nextDouble();
        double PercentHead = 0;
        double PercentTail = 0;
        int head = 0;
        int tail = 0;
        for( int i = 0; i<=num;i++){
            double random = Math.random();
            if (random <= 0.5){
                head++;
            }else {
                tail++;

            }
        }
        PercentHead = (head * 100)/(double)num;
        PercentTail = (tail * 100)/(double)num;
        System.out.println("the head flip "+head+" times \n percentage is " +PercentHead);
        System.out.println("the tail flip "+tail+" times \n percentage is " +PercentTail);

    }
}
