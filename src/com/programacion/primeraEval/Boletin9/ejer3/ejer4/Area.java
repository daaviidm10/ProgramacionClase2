package com.programacion.primeraEval.Boletin9.ejer3.ejer4;

public class Area {
    public int area, base, altura;

    public void conseguirArea(){

        base= Integer.parseInt(JOptionPane.showInputDialog("Introoduce a base"));
        altura= Integer.parseInt(JOptionPane.showInputDialog("Introoduce a altura"));

        if(base>0 && altura>0){
            area=base*altura;
            System.out.println("Area=" +area);
        }
        else{
            System.out.println("Numero incorrecto");
        }
    }
}