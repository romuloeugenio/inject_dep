package model;

public class Product {

    private double price; 
    private String name;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }
    
    public String getname() {
        return name;
        
    }
    
    public double getprice() {
        return price;
        
    }



}