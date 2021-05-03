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
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    private int id;
    private String nome;
    private String apelidos;
    private int edad;

    public SeleccionFutbol(int id, String nome, String apelidos, int edad) {
        this.id = id;
        this.nome = nome;
        this.apelidos = apelidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public int getEdad() {
        return edad;
    }
    
    

    @Override
    public String toString() {
        return "SeleccionFutbol{" + "id=" + id + ", nome=" + nome + ", apelidos=" + apelidos + ", edad=" + edad + '}';
    }
    



}

