/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dmama
 */
public class Boletin14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConversorTemperaturas ct = new ConversorTemperaturas();
        try {
            ct.centigradosAFharenheit(Float.parseFloat(JOptionPane.showInputDialog("Introduce los grados")));
        } catch (TemperaturaErradaExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }

}
