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
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int anosExperiencia;

    public Masajista(String titulacion, int anosExperiencia, int id, String nome, String apelidos, int edad) {
        super(id, nome, apelidos, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista se concentra");
    }

    @Override
    public void viajar() {
       System.out.println("El masajista viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El masajista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El masajista asiste a los lesionados");
    }

    @Override
    public String toString() {
        return "Masajista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }
   
    

    
    
    

}
