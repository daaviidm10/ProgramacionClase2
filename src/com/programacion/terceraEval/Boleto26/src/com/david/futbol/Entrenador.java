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
public class Entrenador extends SeleccionFutbol{
    private int idFederacion;

    public Entrenador(int idFederacion, int id, String nome, String apelidos, int edad) {
        super(id, nome, apelidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }
    public void planificarEntrenamiento(){
        
    }

    @Override
    public void concentrarse() {
         System.out.println("El etrenador se concentra");

    }

    @Override
    public void viajar() {
      System.out.println("El etrenador viaja");
    }

    @Override
    public void entrenar() {
       System.out.println("El etrenador entrena a los jugadores");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El etrenador dirige");
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    
    
    
    
    
}
