/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl8;

/**
 *
 * @author student
 */
public class Main {
    public static void main(String[] args) {
        String[][] kolekcja = new String[10][3];
        Książka książka = new Książka("Harry Potter", 50, "Opowiada o chłopcu który przeżył");
        

        
        kolekcja[0][0] = książka.getName();
        kolekcja[0][1] = String.valueOf(książka.getPrice());
        kolekcja[0][2] = książka.getDescribe();
        
        Czekolada czekolada = new Czekolada("Milka", 3, "Czekolada mleczna");
        kolekcja[1][0] = czekolada.getName();
        kolekcja[1][1] = String.valueOf(czekolada.getPrice());
        kolekcja[1][2] = czekolada.getDescribe();
        
        Książka książka1 = new Książka("Władca pierścieni", 70, "Opowiada o Hobbitach którzy muszą zniszczyć pierścień");
        kolekcja[2][0] = książka1.getName();
        kolekcja[2][1] = String.valueOf(książka1.getPrice());
        kolekcja[2][2] = książka1.getDescribe();
        
        Długopis długopis = new Długopis("Długopis", 2, "Długopis pisący na zielono");
        kolekcja[3][0] = długopis.getName();
        kolekcja[3][1] = String.valueOf(długopis.getPrice());
        kolekcja[3][2] = długopis.getDescribe();
        
        Dżem dżem = new Dżem("Dżem", 4, "Dżem wiśniowy");
        kolekcja[4][0] = dżem.getName();
        kolekcja[4][1] = String.valueOf(dżem.getPrice());
        kolekcja[4][2] = dżem.getDescribe();
        
        Polopiryna polopiryna = new Polopiryna("Polopiryna", 7, "Pomaga na przeziębienie");
        kolekcja[5][0] = polopiryna.getName();
        kolekcja[5][1] = String.valueOf(polopiryna.getPrice());
        kolekcja[5][2] = polopiryna.getDescribe();
        
        Dżem dżem1 = new Dżem("Dżem", 4.40, "Dżem jagodowy");
        kolekcja[6][0] = dżem1.getName();
        kolekcja[6][1] = String.valueOf(dżem1.getPrice());
        kolekcja[6][2] = dżem1.getDescribe();
        
        Czekolada czekolada1 = new Czekolada("Alpen Gold", 3.20, "Czekolada z orzechami");
        kolekcja[7][0] = czekolada1.getName();
        kolekcja[7][1] = String.valueOf(czekolada1.getPrice());
        kolekcja[7][2] = czekolada1.getDescribe();
        
        Długopis długopis1 = new Długopis("Długopis", 2, "Długopis pisący na zielono");
        kolekcja[8][0] = długopis1.getName();
        kolekcja[8][1] = String.valueOf(długopis1.getPrice());
        kolekcja[8][2] = długopis1.getDescribe();
        
        Książka książka2 = new Książka("Pinokio", 12.99, "Opowiada o chłopcu wystruganym z drewna");
        kolekcja[9][0] = książka2.getName();
        kolekcja[9][1] = String.valueOf(książka2.getPrice());
        kolekcja[9][2] = książka2.getDescribe();
        
        for(int i=0; i<10; i++){
           
        }
    }
}
