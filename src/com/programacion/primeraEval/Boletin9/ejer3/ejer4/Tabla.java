package com.programacion.primeraEval.Boletin9.ejer3.ejer4;

public class Tabla {
    public float numero;

    public void tablamulti(){
        do{
            numero= Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero"));
            System.out.println("1*"+numero+"="+numero+"/n2*"+numero+"="+2*numero+"/n3*"+numero+"="+3*numero);


        }while(numero!=0);

    }
}