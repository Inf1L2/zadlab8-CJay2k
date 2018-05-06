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
public class Trojkat extends FiguraPlaska{
    private double a, b, c, h;

    public Trojkat(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    
    @Override
    public double obliczObwod() {
        return this.a+this.b+this.c;
    }

    @Override
    public double obliczPole() {
        return this.a/2*this.h;
    }
    
    @Override
    public String toString() {
        return "Trójkąt: " + "Bok 1=" + this.a + ", Bok 2=" + this.b + ", Bok 3=" + this.c + ", Wysokość=" + this.h + ", Obwód=" + obliczObwod() + ", Pole=" + obliczPole();
    }
}
