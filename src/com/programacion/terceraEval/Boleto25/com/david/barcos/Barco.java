/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.barcos;

import java.util.ArrayList;

/**
 *
 * @author dma
 */
public abstract class Barco {
    private String matrícula;
    private float eslora;
    private int días;

    public Barco(String matrícula, float eslora, int días) {
        this.matrícula = matrícula;
        this.eslora = eslora;
        this.días = días;
    }


    public String getMatrícula() {
        return matrícula;
    }

    public float getEslora() {
        return eslora;
    }

    public int getDías() {
        return días;
    }


    @Override
    public String toString() {
        return "Factura: " + "\nmatrícula --> "+ matrícula +"\neslora --> " + eslora +"\nDías alugado --> " + días + "\n"+ "Precio a pagar de aluguer: "+ días*10*eslora ;
    }




}
