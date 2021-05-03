/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.futbol;

/**
 *
 * @author dmama
 */
public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcación;

    public Futbolista(int dorsal, String demarcación, int id, String nome, String apelidos, int edad) {
        super(id, nome, apelidos, edad);
        this.dorsal = dorsal;
        this.demarcación = demarcación;
    }
    public void entrevista(){
        
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El futbolista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista juega el partido");
    }

    @Override
    public String toString() {
        return "Futbolista{" + "dorsal=" + dorsal + ", demarcaci\u00f3n=" + demarcación + '}';
    }

    
    

 
     
}
