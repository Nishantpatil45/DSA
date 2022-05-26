package com.webline.dsasession.array;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {

        int n, p, e;
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
        System.out.println("\nEnter the Index Position you want to change: ");
        p = s.nextInt();
        System.out.println("\nEnter the Element: ");
        e = s.nextInt();
        for (int i = arr.length - 1; i > p; i--) {
            arr[i] = arr[i - 1];
        }
        arr[p] = e;
        System.out.println("\nNew array we get is\n");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

}
