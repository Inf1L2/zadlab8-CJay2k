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
public class Kolo extends FiguraPlaska{
    private double r;

    public Kolo(double r) {
        this.r = r;
    }
    
    @Override
    public double obliczObwod() {
        return 2*Math.PI*this.r;
    }

    @Override
    public double obliczPole() {
        return Math.PI*Math.pow(this.r, 2);
    }
    
    @Override
    public String toString() {
        return "Koło: " + "Promień=" + this.r + ", Obwód=" + obliczObwod() + ", Pole=" + obliczPole();
    }
}
