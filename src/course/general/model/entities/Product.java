package course.general.model.entities;

import java.util.Scanner;

public class Product {

    //variables
    private String name;
    private double price;
    private int quantity;

    //constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //methods
    public double totalValueStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        if(quantity > 0){
            this.quantity += quantity;
        }else{
            System.out.println("Invalid value!!");
        }
    }
    public void removeProducts(int quantity){
        if(quantity > 0){
            this.quantity -= quantity;
        }else{
            System.out.println("Invalid value!!");
        }
    }
    public void info(){
        System.out.printf("%s, $ %.2f, %d units, Total: %.2f", name, price, quantity, totalValueStock());
    }

    //Main Function
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Product product = new Product("TV", 2150.99, 8);
        //product.info();

        System.out.println("\nEnter the number of products to be added in stock:");
        product.addProducts(scan.nextInt());
        product.info();

        System.out.println("\nEnter the number of products to be removed from stock:");
        product.removeProducts(scan.nextInt());
        product.info();

        scan.close();
    }
}
