/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensup.BO;

/**
 *
 * @author lorris
 */
public class Personne {
   private String nom;
   private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public Personne() {
    }
   
   

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return   nom +" " + age;
    }
   
   
   
    
}
