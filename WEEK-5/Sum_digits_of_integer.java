package com.mycompany.digits_of_integer;
import java.util.*;
public class Sum_digits_of_integer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        
        while(n>0){
            int r = n%10;
            n = n/10;
            sum = sum + r;
        }
        System.out.println("Sum of the digits = " + sum);
        
    }
}
