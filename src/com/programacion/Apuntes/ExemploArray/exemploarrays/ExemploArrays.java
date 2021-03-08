/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarrays;

import exemploarrays.paquete1.metodos;

/**
 *
 * @author dam1b
 */
public class ExemploArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[]temperaturas = {8,10,12,3.5f,5,18,32,2};

        metodos obxMe = new metodos();
        System.out.println("lista de temperaturas");
        obxMe.amosarArrayForeach(temperaturas);
        //System.out.println("lista ordenada");
        //obxMe.ordenar(temperaturas);
        //obxMe.amosarArray(temperaturas);
        obxMe.ordenarDirecto(temperaturas);
        obxMe.amosarArray(temperaturas);
        //obxMe.busqueda(temperaturas);
        //obxMe.busquedaElementos(temperaturas);
        //obxMe.amosarArray(temperaturas);
    }

}
