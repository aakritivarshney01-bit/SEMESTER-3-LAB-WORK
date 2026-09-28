package com.mycompany.fruit_class;


class Fruit {
    String name;
    String color;
    String taste;
    int price;

    void display() {
        System.out.println("Name - " + name);
        System.out.println("Colour of " + name + " - " + color);
        System.out.println("Taste of " + name + " - " + taste);
        System.out.println("Price of " + name + " - " + price);
    }
}

public class Fruit_class {
    public static void main(String args[]) {

        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit();
        Fruit f3 = new Fruit();

        f1.name = "Apple";
        f1.color = "Red";
        f1.taste = "Sweet";
        f1.price = 100;

        f2.name = "Mango";
        f2.color = "Yellow";
        f2.taste = "Sweet";
        f2.price = 80;

        f3.name = "Orange";
        f3.color = "Orange";
        f3.taste = "Sour";
        f3.price = 60;

        f1.display();
        f2.display();
        f3.display();
    }
}


