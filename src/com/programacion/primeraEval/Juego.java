
package com.programacion.primeraEval;

import javax.swing.JOptionPane;


public class Juego {


    public void juego(){

        int numero2,numero1=Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 introduce numero"));
        do{
            numero2=Integer.parseInt(JOptionPane.showInputDialog("Jugador 2 adivine el numero"));
            if(numero2<numero1){
                System.out.println("És más grande");
            }else if(numero2>numero1){
                System.out.println("És más pequeño");
            }
        }while(numero1!=numero2);
        System.out.println("Numero correcto");
    }
}