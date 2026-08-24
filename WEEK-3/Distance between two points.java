
package javaapplication49;
import java.util.Scanner;
public class JavaApplication49 {

   
    public static void main(String[] args) {
       
        Scanner ad = new Scanner(System.in);
        
        System.out.println("Enter x1");
        double x1 = ad.nextDouble();
        
        System.out.println("Enter y1");
        double y1 = ad.nextDouble();
        
        System.out.println("Enter x2");
        double x2 = ad.nextDouble();
        
        System.out.println("Enter y2");
        double y2 = ad.nextDouble();
        
        double distance = Math.sqrt(Math.pow(x2- x1, 2)Math.pow(y2- y1,2));
        
        System.out.println("The distance between entered 2 points is :" +(distance));
        
    }
    
}
