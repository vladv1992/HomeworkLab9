package ro.fasttrackit.lab9;

import java.sql.Array;
import java.sql.SQLOutput;

class Product {
    int price;
    private String name;
    private String description;
    private double quantity;
    private int elements;

    public Product(int price, String name, String description, double quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public void printProduc() {
        System.out.println("The price is: " + price);
        System.out.println("Name of product: " + name);
        System.out.println("Description of product" + description);
        System.out.println("Pieces: " + quantity);
    }

    public int getElements() {
        return elements;
    }

    public void setElements(int elements) {
        this.elements = elements;

    }
}

class Cosmetics extends Product {
    private String color;
    private int weight;

    public Cosmetics(int price, String name, String description, double quantity, String color, int weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public void printCosmetics() {
        printProduc();
        System.out.println("is the color: " + color);
        System.out.println("kg: " + weight);
    }
}

class Electronics extends Product {
    private String lenght;
    private String widht;
    private String height;
    private String weight;

    public Electronics(int price, String name, String description, double quantity, String lenght, String wight, String height, String weight) {
        super(price, name, description, quantity);
        this.lenght = lenght;
        this.widht = wight;
        this.height = height;
        this.weight = weight;
    }

    public void printElectronics() {
        System.out.println("Lenght is: " + lenght);
        System.out.println("Widht is: " + widht);
        System.out.println("Height is: " + height);
        System.out.println("Weight is: " + weight);
    }
}

class Fridge extends Electronics {
    public int temperature;

    public Fridge(int price, String name, String description, double quantity, String lenght, String widht, String height, String weight, int temperature) {
        super(price, name, description, quantity, lenght, widht, height, weight);
        this.temperature = temperature;
    }

    public void printElectroics() {
        System.out.println("Temeratur is: " + temperature);
    }

}

class Main {
    public static void main(String[] args) {

        Product prod1 = new Product(1, "Coca-Cola", "this is not halty", 2.3);
        prod1.printProduc();

        Cosmetics cosm = new Cosmetics(3, "Dove", "wash your hands", 4, "red", 1);
        cosm.printCosmetics();
        System.out.println(cosm.getElements());
        System.out.println(cosm.toString());
        Product product = cosm;
        cosm.printProduc();
        //  Cosmetics cosm1 = (Cosmetics) prod1;

        Electronics elctr = new Electronics(2, "cooker", "Use to cook", 1, "2.1", "2", "2", "2.2");
        elctr.printProduc();
        elctr.printElectronics();

        Fridge rgt = new Fridge(1,"Fridge","deposit foods",2.3,"2","2.2","4","40",-30);
        System.out.println(rgt.temperature);
        rgt.printProduc();
        rgt.printElectroics();
    }

}





