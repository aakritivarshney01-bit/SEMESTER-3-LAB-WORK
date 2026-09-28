

package com.mycompany.fruit_class2;
import java.util.*;

class Fruit {
    String name;
    String color;
    String taste;
    int price;

    void setDetails(String n, String c, String t, int p) {
        name = n;
        color = c;
        taste = t;
        price = p;
    }

    void display() {
        System.out.println("Name - " + name);
        System.out.println("Colour of " + name + " - " + color);
        System.out.println("Taste of " + name + " - " + taste);
        System.out.println("Price of " + name + " - " + price);
    }
}

public class Fruit_class2 {
    public static void main(String args[]) {

        Fruit fr = new Fruit();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the credentials of fruit:");

        String name = sc.next();
        String color = sc.next();
        String taste = sc.next();
        int price = sc.nextInt();

        fr.setDetails(name, color, taste, price);

        fr.display();
    }
}

