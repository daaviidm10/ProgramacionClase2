package com.programacion.segundaEval.ExemploArrayBidimensional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraybidimensional;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1b
 */
public class MetodosMatriz {

    int [][]taboanotas;
    String[]listaNomes = new String[validarIntMenorQueCero("numero elemento")];
    public static int validarIntMenorQueCero(String menxase){
        int dato;
        do{
            dato=Integer.parseInt(JOptionPane.showInputDialog(menxase));
        }while(dato<=0);

        return dato;
    }
    public int [][] crearMatriz(){
        int filas=validarIntMenorQueCero("numero filas:");
        int columnas=validarIntMenorQueCero("numerode columnas:");
        taboanotas = new int [filas][columnas];
        for(int i=0;i<filas; i++){
            for(int j=0;j<columnas;j++){
                taboanotas[i][j] =validarIntMenorQueCero("nota: ");
            }
        }
        return taboanotas;
    }
    public void amosar(int [][]taboa){

        for(int i=0; i<taboa.length;i++){

            System.out.println("\n");
            System.out.println(listaNomes[i]);
            for(int j=0;j<taboa[i].length;j++){

                System.out.println(taboa[i][j]+"   ");
            }
        }
    }
    public void notaMediaAlumno(int [][]taboa){
        int acumulador=0;
        for(int i=0;i<taboa.length;i++){
            acumulador=0;

            for(int j=0; j<taboa[i].length;j++){

                acumulador = acumulador + taboa[i][j];
            }
            System.out.println("**"+acumulador/ taboa [i].length);
        }
    }
    public void notaMediaModulo(int [][]taboa){
        int acumulador=0;
        for(int i=0;i<taboa.length;i++){
            acumulador=0;

            for(int j=0; j<taboa[i].length;j++){

                acumulador = acumulador + taboa[j][i];
            }
            System.out.println("**"+acumulador/ taboa [i].length);
        }
    }
    public void crearListaNomes(){
        for (int i=0;i<listaNomes.length;i++){

        }
    }

}
