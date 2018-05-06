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
public class Rownoleglobok extends FiguraPlaska{
    private double a, b, h;

    public Rownoleglobok(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }
    
    @Override
    public double obliczObwod() {
        return 2*this.a+2*this.b;
    }

    @Override
    public double obliczPole() {
        return this.a*this.h;
    }
    
    @Override
    public String toString() {
        return "Równoległobok: " + "Bok 1=" + this.a + ", Bok 2=" + this.b + ", Wysokość=" + this.h + ", Obwód=" + obliczObwod() + ", Pole=" + obliczPole();
    }
}
