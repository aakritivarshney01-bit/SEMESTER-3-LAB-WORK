package com.mycompany.Array_display;

import java.util.*;
public class Array_display {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[6];
        
        System.out.println("Enter  array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            arr[i] = (i + 1) * 10;
        }

        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
      
    }
}
