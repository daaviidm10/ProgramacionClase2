package com.programacion.segundaEval.Boletin15;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

/**
 *
 * @author dam1b
 */
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numeros m = new Numeros();
        //double []numeros={m.numerosAleatoriosDouble(),m.numerosAleatoriosDouble(),m.numerosAleatoriosDouble(),m.numerosAleatoriosDouble(),m.numerosAleatoriosDouble(),m.numerosAleatoriosDouble()};
        int []notas ={ m.notasProgramacion(),m.notasProgramacion(),m.notasProgramacion(),m.notasProgramacion(),m.notasProgramacion()};
        //1er ejercicio
        //m.mostrarArray(numeros);
        //m.mostrarArrayReves(numeros);
        //m.mostrarArray(numeros);
        //2º ejercicio
        m.mostrarNotas(notas);
        m.notaMedia(notas);

    }