package com.webline.dsasession.array;
import java.util.Scanner;
public class Exercise01{
    public static void main(String[] args) {
        
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Length of Array: ");
        n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Element in Array: ");
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum of Array elements is: " + sum);
    }
}