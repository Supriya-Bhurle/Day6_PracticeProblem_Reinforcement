package com.bridghlabz.functionprogram;

public class ThreeIntegerAddsToZERO {
    public static void main(String[] args) {
        int arr[] = { 0, -1, 2, -3, 1 };
        int n = arr.length;
        findTriples(arr, n);

    }
    static void findTriples(int[] arr, int n) {
        boolean find = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " "
                                + arr[j] + " "
                                + arr[k]);
                        find = true;
                    }
                }
            }
        }

        // If no triplet with 0 sum found in array
        if (find == false)
            System.out.println(" not exist ");

    }

}

