/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl8;

/**
 *
 * @author student
 */
public class Książka extends Product{
    public Książka(String name, double price, String describe) {
        super(name, price, describe);
    }

    @Override
    public void buy() {
        System.out.println("Kupiłem książkę");
    }

    @Override
    public void showInfo() {
        System.out.println("Cena:" + getPrice() + " nazwa:" + getName() + " opis:" + getDescribe());
    }
}
