/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dmama
 */
public class Boletin18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Correo> correo = new ArrayList<Correo>();
        Buzon b = new Buzon();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu" + "\n1 Recibir Correo"+ "\n2 Cuantos correos hay en el buzon"+ "\n3 Quedan correos por ler?"+ "\n4 Mostrar primer correo non lido"+ "\n5 Mostrar correo especifico"+ "\n6 Eliminar correo especifico"+ "\n0 Salir"));
            switch (opcion) {
                case 1:
                    b.añadirCorreo(correo);
                    break;
                case 2:
                    System.out.println("Hay " + b.numeroDeCorreos(correo) + " correos");
                    break;
                case 3:
                    System.out.println(b.noLeido(correo));
                    break;
                case 4:
                    System.out.println(b.amosaPrimerNoLeido(correo));
                    break;
                case 5:
                    System.out.println(b.amosa(Integer.parseInt(JOptionPane.showInputDialog("Numero correo a ler")), correo));
                    break;
                case 6:
                    b.elimina(Integer.parseInt(JOptionPane.showInputDialog("Numero correo a ler")), correo);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (opcion != 0);
    }
}

