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
public class Romb extends FiguraPlaska{
    private double a, h;

    public Romb(double a, double h) {
        this.a = a;
        this.h = h;
    }
    
    @Override
    public double obliczObwod() {
        return 4*this.a;
    }

    @Override
    public double obliczPole() {
        return this.a*this.h;
    }
    
    @Override
    public String toString() {
        return "Romb: " + "Bok 1=" + this.a + ", Wysokość=" + this.h + ", Obwód=" + obliczObwod() + ", Pole=" + obliczPole();
    }
}
