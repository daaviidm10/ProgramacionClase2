package com.programacion.segundaEval.Boletin13;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13;

/**
 *
 * @author dmama
 */
public class Boletin13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Avestruz avestruz = new Avestruz();
        avestruz.amosar();
        avestruz.podenCamiñar();
        Papagaio papagaio= new Papagaio();
        papagaio.amosar();
        papagaio.podenVoar();
        papagaio.podenCamiñar();
        Morcego murcielago= new Morcego();
        murcielago.amosar();
        murcielago.podenCamiñar();
        murcielago.podenVoar();
        Gato gato = new Gato();
        gato.amosar();
        gato.podenCamiñar();
        gato.podenNadar();
        Tigre tigre = new Tigre();
        tigre.amosar();
        tigre.podenCamiñar();
        tigre.podenNadar();


    }
}
