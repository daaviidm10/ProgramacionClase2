/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

/**
 *
 * @author dmama
 */
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class metodos {
    public static void engadirElemento(ArrayList<Libreria> listaLib){
        Libreria ele=pedirLibro("Libro que se va a añadir:");
        listaLib.add(ele);
    }

    public static Libreria pedirLibro(String menxase){
        String titulo=JOptionPane.showInputDialog("Introduce titulo del libro");
        String autor= JOptionPane.showInputDialog("Introduce autor del libro");
        String isbn=JOptionPane.showInputDialog("Introduce ISBN del libro");
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad del ejemplar"));
        float prezo=Float.parseFloat(JOptionPane.showInputDialog("Introduce precio del libro"));
        Libreria lib=new Libreria(titulo,autor,isbn,numero,prezo);
        return lib;
    }

    public static void amosarLib(ArrayList<Libreria> listaLib){
        ordenar(listaLib);
        for(Libreria lib:listaLib){
            System.out.println(lib);
        }
    }

    public static void ordenar(ArrayList<Libreria> listaLib){
        Collections.sort(listaLib);
    }

    public static void buscarLibro(ArrayList<Libreria> listaLib,String titulo){
        boolean atopado=false; //non está na lista
        for(Libreria ele:listaLib){
            if(ele.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println(ele.toString());
                atopado=true;
            }
        }
        if(!atopado)
            System.out.println("No esta na lista");
    }

    public static void VenderLibro(ArrayList<Libreria> listaLib, String titulo){
        boolean atopado=false; //non está na lista
        int aux;
        Iterator it= listaLib.iterator();
        while(it.hasNext()){
            Libreria lib=(Libreria)it.next();
            if(lib.getTitulo().equalsIgnoreCase(titulo)){
                aux=lib.getNumero()-1;
                lib.setNumero(aux);
                if(lib.getNumero()==0){
                    it.remove();
                }
            }
            atopado=true;
        }
        if(!atopado)
            System.out.println("No esta na lista");

    }
}
