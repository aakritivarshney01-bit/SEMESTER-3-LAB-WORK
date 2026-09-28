
package com.mycompany.fruit_class3;

class Fruit {
    String name;
    String color;
    String taste;
    int price;

    Fruit(String n, String c, String t, int p) {
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

public class Fruit_class3 {
    public static void main(String args[]) {

        Fruit fr = new Fruit("Apple", "Red", "Sweet", 100);

        fr.display();
    }
}

