/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensup.Presentation;

import com.ensup.BO.Personne;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author lorris
 */
public class Lanceur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Personne> liste = remplir();
        System.out.println(liste.toString());
       Collections.sort(liste,(p1, p2) -> {return p1.getNom().compareTo(p2.getNom());});
       System.out.println(liste.toString());
       
       
        // TODO code application logic here
    }
    
    public static ArrayList<Personne> remplir()
    {
        ArrayList<Personne> liste = new ArrayList<>();
        Personne p = new Personne();
        p.setAge(18);
        p.setNom("bill");
        liste.add(p);
        Personne p1 = new Personne();
        p1.setAge(20);
        p1.setNom("eva");
        liste.add(p1);
        Personne p2 = new Personne();
        p2.setAge(22);
        p2.setNom("luc");
        liste.add(p2);
        Personne p3 = new Personne("benoit", 27);
        liste.add(p3);
        return liste;
    }
    
}