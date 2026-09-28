
package com.mycompany.fruit_class5;
class Fruit {
    String name;
    String color;
    String taste;
    int price;

   
    Fruit() {
        this("Apple");
    }

    
    Fruit(String n) {
        this(n, "Red");
    }


    Fruit(String n, String c) {
        name = n;
        color = c;
        taste = "Sweet";
        price = 100;
    }

    void display() {
        System.out.println("Name - " + name);
        System.out.println("Colour of " + name + " - " + color);
        System.out.println("Taste of " + name + " - " + taste);
        System.out.println("Price of " + name + " - " + price);
    }
}

public class Fruit_class5 {
    public static void main(String args[]) {

        Fruit fr = new Fruit();

        fr.display();
    }
}

