package com.mycompany.Sum_of_array_elements;
import java.util.Scanner;

public class Sum_of_array_elements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter 5 array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
         System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        

        System.out.println("\nSum of array elements = " + sum);
    }
}

    

