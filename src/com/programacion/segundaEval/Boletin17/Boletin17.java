/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author dmama
 */
import Libreria.Libreria;
import Libreria.metodos;
import javax.swing.*;
import java.util.ArrayList;

public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Libreria> libro=new ArrayList<Libreria>();

        String opcion;

        do{
            opcion= JOptionPane.showInputDialog("MENU\n1 Añadir un Libro\n2 Mi libreria\n3 Buscar por titulo\n4 Vender Libro\n0 Salir");
            switch(opcion){
                case "1": metodos.engadirElemento(libro);
                    break;
                case "2": metodos.amosarLib(libro);
                    break;
                case "0":System.exit(0);
                    break;
                case "3": metodos.buscarLibro(libro, JOptionPane.showInputDialog("Titulo de la busqueda"));
                    break;
                case "4": metodos.VenderLibro(libro,JOptionPane.showInputDialog("Titulo a vender"));
            }
        }while(!opcion.equals("0"));


    }

}
