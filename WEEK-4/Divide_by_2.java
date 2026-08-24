
package com.mycompany.divide_by_2;
import java.util.Scanner;
public class Divide_by_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR VALUE =");
        int n=sc.nextInt();
        
        while(n>10){
            n=n/2;
            if(n>10){
            System.out.println(n);
        }
    }
}
}
