/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin16;
import javax.swing.*;
import java.util.ArrayList;
/**
 *
 * @author dmama
 */
public class Boletin16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Nums> lista = new ArrayList<Nums>();
        ArrayList<Altura> altura = new ArrayList<Altura>();


        String opcion;
        String texto = "www.javadesde0.com";
        String texto1 = texto.substring(0, 8);
        String texto2 = texto.substring(8, 18);
        System.out.println(texto1 + "\n" + texto2);
        texto = texto1.concat(texto2);
        System.out.println(texto);

        String mayus = "javeros";
        mayus = mayus.toUpperCase();
        System.out.println(mayus);
        mayus = mayus.toLowerCase();
        System.out.println(mayus);
        //Creamos o menú que saltará en pantalla con todas as opcións dispoñibles
        do {
            opcion = JOptionPane.showInputDialog("MENU\n1 Engadir Numero\n2 Amosar\n3 Pedir altura\n4 Amosar datos altura\n0 Sair");
            switch (opcion) {
                case "1":
                    metodos.engadirElementoNum(lista);
                    break;
                case "2":
                    metodos.amosarNum(lista);
                    break;
                case "3":
                    metodos.añadirAltura(altura);
                    break;
                case "4":
                    metodos.amosarAlt(altura);
                    break;
                case "0":
                    System.exit(0);
                    break;
            }
        } while (!opcion.equals("0"));



    }

}
