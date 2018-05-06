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
public class Walec extends FiguraPrzestrzenna{
    private double r, h;

    public Walec(double r, double h) {
        this.r = r;
        this.h = h;
    }
    
    @Override
    public double obliczObjetosc() {
        return Math.PI*Math.pow(this.r, 2)*this.h;
    }

    @Override
    public double obliczPole() {
        return 2*Math.PI*this.r*(this.r+this.h);
    }

    @Override
    public String toString() {
        return "Walec: " + "Promień=" + this.r + ", Wysokość=" + this.h + ", Objętość=" + obliczObjetosc() + ", Pole=" + obliczPole();
    }
    
    
}
