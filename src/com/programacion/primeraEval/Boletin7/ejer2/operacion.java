package com.programacion.primeraEval.Boletin7.ejer2;

/**
 *
 * @author dam1b
 */
public class operacion {
    public void operacion(int num1, int num2, int resta, int suma){
        if (num1>=num2){
            resta=num1-num2;
            System.out.println("A resta e:"+resta);
        }
        else{
            suma=num1+num2;
            System.out.println("A suma é:"+suma);
        }
    }
}
