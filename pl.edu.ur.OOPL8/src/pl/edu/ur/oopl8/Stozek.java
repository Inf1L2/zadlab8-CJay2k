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
public class Stozek extends FiguraPrzestrzenna{
    private double r, h, l;

    public Stozek(double r, double h, double l) {
        this.r = r;
        this.h = h;
        this.l = l;
    }

    @Override
    public double obliczObjetosc() {
        return Math.PI/3*Math.pow(this.r, 2)*this.h;
    }

    @Override
    public double obliczPole() {
        return Math.PI*this.r*(this.r+this.l);
    }
    
    @Override
    public String toString() {
        return "Stożek: " + "Promień=" + this.r + ", Wysokość=" + this.h + ", l=" + this.l + ", Objętość=" + obliczObjetosc() + ", Pole=" + obliczPole();
    }
}
