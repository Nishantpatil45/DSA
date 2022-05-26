package com.webline.dsasession.array;

import java.util.Scanner;

public class Exercise09 {

    public static void main(String[] args) {

        int n;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store in a Array: ");
        n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nMaximum element is " + max);
        System.out.println("Minimum element is " + min);
    }

}
