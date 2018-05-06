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
public class Prostopadloscian extends FiguraPrzestrzenna{
    private double a, b, c;

    public Prostopadloscian(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public double obliczObjetosc() {
        return this.a*this.b*this.c;
    }

    @Override
    public double obliczPole() {
        return 2*this.a*this.b+2*this.b*this.c+2*this.a*this.c;
    }
    
    @Override
    public String toString() {
        return "Prostopadłościan: " + "Bok 1=" + this.a + ", Bok 2=" + this.b + ", Bok 3=" + this.c + ", Objętość=" + obliczObjetosc() + ", Pole=" + obliczPole();
    }
}
