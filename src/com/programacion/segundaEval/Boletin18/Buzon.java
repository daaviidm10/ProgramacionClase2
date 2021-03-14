/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

/**
 *
 * @author dmama
 */
import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Buzon {
    public int numeroDeCorreos(ArrayList<Correo> listaCorreo) {
        int aux = 0;
        for (Correo ele : listaCorreo) {
            aux++;
        }
        //System.out.println("Hay "+aux+" correos");
        return aux;
    }

    public void añadirCorreo (ArrayList<Correo> listaCorreo) {
        Correo co = pedirCorreo("Corro que se va a añadir: ");
        listaCorreo.add(co);
    }

    public static Correo pedirCorreo(String menxase) {
        String contido = JOptionPane.showInputDialog("Introduce correo");
        int numero;
        boolean leído;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("0-NO Leido\n1-Leido"));
        } while (numero != 0 && numero != 1);
        if (numero == 1) {
            leído = true;
        } else
            leído = false;
        Correo co = new Correo(contido, leído);
        return co;
    }

    public boolean noLeido(ArrayList<Correo> listaCorreo) {
        boolean aux = false;
        for (Correo ele : listaCorreo) {
            if (ele.isLido() == false)//si el correo no esta leido que marque aux como que hay correos sin leer
                aux = true;
        }
        //System.out.println("Hay "+aux+" correos");
        return aux;
    }

    public String amosaPrimerNoLeido(ArrayList<Correo> listaCorreo) {
        int aux = 0;
        String string = "Todos los correos leidos";
        for (Correo ele : listaCorreo) {
            if (aux == 0 && ele.isLido() == false) {
                aux = 1;
                string = ele.getContido();
                ele.setLido(true);
            }
        }
        return string;
    }

    public String amosa(int correo, ArrayList<Correo> listaCorreo) {
        int aux = 1;
        String co = "Este correo no existe";
        for (Correo ele : listaCorreo) {
            if (aux == correo) {
                co = ele.getContido();
            }
            aux++;
        }
        return co;
    }

    public void elimina(int correo, ArrayList<Correo> listaCorreo) {
        int aux = 1;
        Iterator it = listaCorreo.iterator();
        while (it.hasNext()) {
            Correo co = (Correo) it.next();
            if (aux == correo) {
                it.remove();
            }
            aux++;
        }
    }
}
