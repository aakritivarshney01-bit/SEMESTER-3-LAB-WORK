package com.mycompany.series;
import java.util.Scanner;
public class Series {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR VALUE= ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0; i<=n ; i++){
            sum=sum+i;
        }
        System.out.println("SUM OF THE SERIES = "+sum);
    }
}
