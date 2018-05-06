/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl8;

/**
 *
 * @author Adrian Hrycaj
 */
public class Prostokat extends FiguraPlaska{
    private double a, b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public double obliczObwod() {
        return 2*a+2*b;
    }

    @Override
    public double obliczPole() {
        return a*b;
    }
    
    @Override
    public String toString() {
        return "Prostokąt: " + "Bok 1=" + this.a + ", Bok 2=" + this.b + ", Obwód=" + obliczObwod() + ", Pole=" + obliczPole();
    }
}
