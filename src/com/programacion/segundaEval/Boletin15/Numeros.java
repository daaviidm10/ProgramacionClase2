package com.programacion.segundaEval.Boletin15;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

/**
 *
 * @author dmama
 */
public class Numeros {
    public double numerosAleatoriosDouble(){
        double num=Math.random()*49 + 1;
        return num;
    }


    public void mostrarArray(double[]lista){
        for(int i=0;i<lista.length;i++){
            System.out.println("Numero "+(i+1)+"---->"+lista[i]);
        }

    }
    public void mostrarArrayReves(double[]lista){
        double aux;
        for (int i=0; i<lista.length/2; i++) {
            aux = lista[i];
            lista[i] = lista[lista.length-1-i];
            lista[lista.length-1-i] = aux;
        }
    }
    public int notasProgramacion(){
        int num=(int) (Math.random()*10);
        return num;
    }

    public void mostrarNotas(int[]lista){
        int aprobado = 0;
        int suspenso = 0;
        int sinNota = 0;
        for(int i=0;i<lista.length;i++){
            if(lista[i]<5 && lista[i]>=0){
                suspenso++;
            }
            else if(lista[i]>=5){
                aprobado++;

            }else{
                sinNota++;
            }
            System.out.println("Nota: \n "+lista[i]);
        }

        System.out.println("Nº de alumnos aprobados -->"+ aprobado+"\nNº de alumnos supensos --> "+suspenso+"\nNº de alumnos sin nota -->");
    }
    public void notaMedia(int[]lista){
        float media, aux=0;
        for(int i=0; i<lista.length; i++){
            aux=aux+lista[i];
        }
        media=aux/5;
        System.out.println("Nota media = "+media);
    }
    public void notaMaisAlta(int[]lista){
        float nota;
        for(int i=0;i<lista.length; i++){

        }
    }
}