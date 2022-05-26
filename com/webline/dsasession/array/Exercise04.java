package com.webline.dsasession.array;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        int n, sum = 0;
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
        System.out.println("\nAverage value of the array elements is : ");
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = sum / arr.length;
        System.out.println(avg + " ");
    }

}
