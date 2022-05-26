package com.webline.dsasession.array;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        int n, r;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store in a Array: ");
        n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the Element you want to Check: ");
        r = s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (r == arr[i]) {
                System.out.println("Array contains the given element");
            }
        }
    }

}
