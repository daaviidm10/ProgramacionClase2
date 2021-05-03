/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.main;

import com.david.futbol.*;
import com.david.futbol.SeleccionFutbol;
import java.util.ArrayList;

/**
 *
 * @author dmama
 */
public class Boleto26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SeleccionFutbol>lista = new ArrayList<>();
        SeleccionFutbol FU = new Futbolista (1,"central",4,"Pedro","Lópes",20);
        SeleccionFutbol MA = new Masajista ("Maestro",7,1232,"Julia","Vázquez",24);
        SeleccionFutbol EN = new Entrenador (545,2544,"Noé","Carballo",42);
        lista.add(FU);
        lista.add(MA);
        lista.add(EN);
        
        
         for (SeleccionFutbol ele:lista){
            System.out.println(ele.toString());
            ele.concentrarse();
            ele.entrenar();
            ele.jugarPartido();
            ele.viajar();
             System.out.println("");
        }
        
    }
    
}
