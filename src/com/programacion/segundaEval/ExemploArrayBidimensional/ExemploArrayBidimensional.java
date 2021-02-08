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
public class ExemploArrayBidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opcion;
        MetodosMatriz obx = new MetodosMatriz();
        do{
            opcion = JOptionPane.showInputDialog("*** Menú ***\n 1.-Crear matriz\n 2.-amosar\n3.-Media alumno\n4.-Fin");
            switch(opcion){
                case"crear": obx.crearMatriz();
                    break;
                case "amosar":obx.amosar(obx.taboanotas);
                    break;
                case "media":obx.notaMediaAlumno(obx.taboanotas);
                    break;
                case "media del modulo":obx.notaMediaModulo(obx.taboanotas);
                    break;
                case "fin":System.exit(0);
            }


        }while(opcion.equalsIgnoreCase("fin")==false);
    }

}
