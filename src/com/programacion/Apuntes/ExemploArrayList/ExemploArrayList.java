/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;

/**
 *
 * @author dam1b
 */
public class ExemploArrayList {


    public static void main(String[] args) {
        //ArrayList <Integer> lista = new ArrayList<Integer>();
        //System.out.println("***creamos arrayList");
        //lista.add(2);
        /**lista.add(" programación");
         lista.add(2.3f);**/
        //lista.add(new Integer (5));
        //System.out.println(lista);
        listaNumeros obx = new listaNumeros();
        for(int i=0;i<4;i++)
            obx.engadir();
        obx.amosarIterator();
        // System.out.println("eliminamos elemento");
        //obx.eliminar();
        obx.amosarForEach();
        obx.numerosPares();


        //System.out.println("engadir numero posicion 1");
        //obx.engadirPosicion(1);
        obx.amosarFor();
    }

}
