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
public class Trapez extends FiguraPlaska{
    private double a, b, c, d, h;

    public Trapez(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }
    
    @Override
    public double obliczObwod() {
        return this.a+this.b+this.c+this.d;
    }

    @Override
    public double obliczPole() {
        return (a+b)/2*h;
    }
    
    @Override
    public String toString() {
        return "Trapez: " + "Bok 1=" + this.a + ", Bok 2=" + this.b + ", Bok 3=" + this.c + ", Bok 4=" + this.d + ", Wysokość=" + this.h + ", Obwód=" + obliczObwod() + ", Pole=" + obliczPole();
    }
}
