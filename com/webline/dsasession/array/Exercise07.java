package com.webline.dsasession.array;

import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store in a Array: ");
        n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("\nArray is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int[] arr1 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println("\nNew Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i] + " ");
        }
    }
}
