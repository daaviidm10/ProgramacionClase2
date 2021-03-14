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
public class metodos {
    public static void engadirElementoNum(ArrayList<Nums> listaNumeros) {
        Nums ele = pedirNum("Añadir alumno:");
        listaNumeros.add(ele);
    }

    public static Nums pedirNum(String menxase) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        Nums num = new Nums(numero);
        return num;
    }

    public static void amosarNum(ArrayList<Nums> listaNumeros) {
        int aux1 = 0, aux2 = 0;
        for (Nums al : listaNumeros) {
            if (al.getNumero() % 2 == 0) {
                aux1++;
            }
            if (al.getNumero() < 0) {
                aux2++;
            }
        }
        System.out.println("Numeros pares:" + aux1 + "\nNumeros negativos:" + aux2);
    }

    public static void añadirAltura(ArrayList<Altura> listaAltura) {
        int engadAltura;
        do {
            engadAltura = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de participantes"));
        } while (engadAltura <= 0);
        for (int i = 0; i < engadAltura; i++) {
            Altura altura = new Altura(Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura")));
            listaAltura.add(altura);
        }
    }

    public static void amosarAlt(ArrayList<Altura> listaAltura) {
        float alturaMedia = 0;
        int altSuperior = 0, altInferior = 0, altIgual = 0, i = 0;
        for (Altura al : listaAltura) {
            alturaMedia = alturaMedia + al.getAltura();
            i++;
        }
        alturaMedia = alturaMedia / i;
        System.out.println("La altura media es " + alturaMedia + " metros.");
        for (Altura al : listaAltura) {
            if (alturaMedia > al.getAltura()) {
                altInferior++;
            } else if (alturaMedia < al.getAltura()) {
                altSuperior++;
            } else {
                altIgual++;
            }
        }
        System.out.println(altInferior + " participantes son inferiores a la media " + altSuperior + " participantes son superiores a la media y " + altIgual + " participantes son iguales a la media");
    }
}
