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
public class Kula extends FiguraPrzestrzenna{
    private double r;

    public Kula(double r) {
        this.r = r;
    }
    
    @Override
    public double obliczObjetosc() {
        return 4/3*Math.PI*Math.pow(this.r, 3);
    }

    @Override
    public double obliczPole() {
        return 4*Math.PI*Math.pow(this.r, 2);
    }
    
    @Override
    public String toString() {
        return "Kula: " + "Promień=" + this.r + ", Objętość=" + obliczObjetosc() + ", Pole=" + obliczPole();
    }
}
