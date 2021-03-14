/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author dmama
 */
public class ConversorTemperaturas {
    static final int TEMPMIN=80;

    public void centigradosAFharenheit(float temperatura) throws TemperaturaErradaExcepcion{
        if (temperatura <TEMPMIN){
            throw new TemperaturaErradaExcepcion("La temperatura tiene que ser como mínimo de 80 grados");

        }else{
            System.out.println(temperatura+" ºC son"+(9.0/5.0*temperatura +32.4)+"ºF");
        }
    }
    public void centígradosAReamur(float temperatura) throws TemperaturaErradaExcepcion {
        if (temperatura < TEMPMIN) {
            throw new TemperaturaErradaExcepcion("La temperatura debe de ser como minimo 80ºC");
        } else {
            double reamur = 4.0 / 5.0 * temperatura;
        }
    }
}
