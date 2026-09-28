package com.mycompany.fruit_class4;
class Fruit {
    String name;
    String color;
    String taste;
    int price;

    
    Fruit() {
        name = "Apple";
        color = "Red";
        taste = "Sweet";
        price = 100;
    }

   
    Fruit(String n) {
        name = n;
        color = "Yellow";
        taste = "Sweet";
        price = 80;
    }

    
    Fruit(String n, String c) {
        name = n;
        color = c;
        taste = "Sweet";
        price = 60;
    }

    void display() {
        System.out.println("Name - " + name);
        System.out.println("Colour of " + name + " - " + color);
        System.out.println("Taste of " + name + " - " + taste);
        System.out.println("Price of " + name + " - " + price);
        System.out.println();
    }
}

public class Fruit_class4 {
    public static void main(String args[]) {

        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit("Mango");
        Fruit f3 = new Fruit("Orange", "Orange");

        f1.display();
        f2.display();
        f3.display();
    }
}

