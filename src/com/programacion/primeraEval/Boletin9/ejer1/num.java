package com.programacion.primeraEval.Boletin9.ejer1;


package boletin91;

import javax.swing.JOptionPane;


public class num {
    private float numero;
    private int j=0, k=0, t=0;

    public void pedirNum(){

        for(int i=0; i<10; i++){
            numero = Float.parseFloat(JOptionPane.showInputDialog("teclea un valor"));
            System.out.println("Numeros introducidos "+numero);
            if (numero>0){
                j++;
            }else if(numero==0){
                t++;
            }
            else{
                k++;
            }
        }

    }
    public void amosar(){
        System.out.println("Numeros positivos "+j+"Numeros negativos"+k+"Numeros cero:"+t);
    }
}