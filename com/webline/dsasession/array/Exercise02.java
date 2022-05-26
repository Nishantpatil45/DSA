package com.webline.dsasession.array;
import java.util.Scanner;
public class Exercise02 {
    public static void main(String[] args) {
        
        
        int n,temp = 0;  
        Scanner s=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store in a Array: ");  
        n=s.nextInt();
        int [] arr = new int[n];    
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++){
          arr[i]=s.nextInt();
        }  

    
       System.out.println("Array before Sorting: ");    
       for (int i = 0; i <arr.length; i++) {     
           System.out.print(arr[i] + " ");    
        }    
        for (int i = 0; i <arr.length; i++) {     
          for (int j = i+1; j <arr.length; j++) {     
              if(arr[i] >arr[j]) {     
                temp = arr[i];    
                arr[i] = arr[j];    
                arr[j] = temp;    
               }     
            }     
        }   
        System.out.println("\nArray sorted Manner: ");    
        for (int i = 0; i <arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }
    }
}
