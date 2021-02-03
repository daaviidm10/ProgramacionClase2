
package com.programacion.primeraEval.boletin2;

import java.util.Scanner;

/**
 *
 * @author dam1b
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float millas,cambio;
        float metros = 1852;
        System.out.println("Teclea as millas: ");
        millas =sc.nextFloat();
        cambio = millas*metros;
        System.out.println("cambio= " + cambio + " metros");
    }

}
