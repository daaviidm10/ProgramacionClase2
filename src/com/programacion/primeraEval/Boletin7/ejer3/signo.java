package com.programacion.primeraEval.Boletin7.ejer3;

/**
 *
 * @author dam1b
 */
public class signo {
    public void simbolo(int num){
        if (num>0){
            System.out.println("O número é positivo");
        }
        else if(num<0){
            System.out.println("O número é negativo");
        }
        else if(num==0){
            System.out.println("O número é cero");
        }
    }
}