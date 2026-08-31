

package com.mycompany.factorial;
import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int factorial=1;
        System.out.println("ENTER YOUR VALUE = ");
        int n=sc.nextInt();
        
        for( int i=1; i<=n; i++){
            factorial=factorial*i;
        }
        System.out.println("FACTORIAL OF " + n + "are = " + factorial);
    }
}
