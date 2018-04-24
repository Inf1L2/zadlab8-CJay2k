/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.edu.ur.oopl8;

public abstract class Product {

    private double price;
    private String name;
    private String describe;

    public Product(String name, double price, String describe) {
        this.name = name;
        this.price = price;
        this.describe = describe;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    public abstract void buy();

    public abstract void showInfo();
}