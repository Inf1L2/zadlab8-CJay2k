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
public class Szascian extends FiguraPrzestrzenna{
    private double a;

    public Szascian(double a) {
        this.a = a;
    }
    
    @Override
    public double obliczObjetosc() {
        return Math.pow(this.a, 3);
    }

    @Override
    public double obliczPole() {
        return 6*Math.pow(this.a, 2);
    }
    
    @Override
    public String toString() {
        return "Sześcian: " + "Bok=" + this.a + "Objętość=" + obliczObjetosc() + ", Pole=" + obliczPole();
    }
}
