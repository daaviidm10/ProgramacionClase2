package com.programacion.primeraEval.Boletin5;

import java.util.Scanner;

/**
 *
 * @author dmama
 */
public class part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Consumo obxCon1 = new Consumo();

        Consumo obxCon2 = new Consumo(1000,20,120,1.33f);
        //float cMed = obxCon2.consumoEuros();
        //obxCon2.setLibros(50f);
        //obxCon2.prezogasolina(1.57f);
        //obxCon2.amosar();
        //    System.out.println( "velocidade media = "+media+"km/s" );//Vel media = espacio/tempo
        System.out.println(obxCon2.getconsumomedio());
        obxCon2.getconsumomedio();


        obxCon2.consumoeuros();

    }

}
