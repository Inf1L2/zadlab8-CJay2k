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
public class Kwadrat extends FiguraPlaska{
    private double a;

    public Kwadrat(double a) {
        this.a = a;
    }
    
    @Override
    public double obliczObwod() {
        return 4*this.a;
    }

    @Override
    public double obliczPole() {
        return Math.pow(this.a, 2);
    }
    
    @Override
    public String toString() {
        return "Kwadrat: " + "Bok=" + this.a + ", Obwód=" + obliczObwod() + ", Pole=" + obliczPole();
    }
}
