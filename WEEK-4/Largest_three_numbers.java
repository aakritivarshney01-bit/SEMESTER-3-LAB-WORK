package com.mycompany.largest_three_numbers;
 import java.util.Scanner;
public class Largest_three_numbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR THREE VALUES-");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        if((a>b)&&(a>c)){
            System.out.println(a+"is largest");
        }
        else if((b>a)&&(b>c)){
            System.out.println(b+"is largest");
        }
        else if((c>b)&&(c>a)){
            System.out.println(c+" is largest");
        }
        else{
            System.out.println("INVALID INPUT");
        }
    }
}
