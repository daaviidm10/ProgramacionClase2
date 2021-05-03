/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.main;

import com.david.barcos.Barco;
import com.david.barcos.Deportivo;
import com.david.barcos.Velero;
import com.david.barcos.Yate;
import java.util.ArrayList;

/**
 *
 * @author dma
 */
public class Boleto25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Barco>listaBarcos = new ArrayList<>();

        Barco v1=new Velero (8,"1268 FFF",7,4);
        Barco d1=new Deportivo (200,"5646 SKJ",12,2);
        Barco y1=new Yate (150,2,"6541 DDD",25,12);
        listaBarcos.add(v1);
        listaBarcos.add(d1);
        listaBarcos.add(y1);

        for (Barco ele:listaBarcos){
            System.out.println(ele.toString());
        }
    }

}
