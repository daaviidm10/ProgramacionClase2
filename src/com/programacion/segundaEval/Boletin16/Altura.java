/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin16;

/**
 *
 * @author dmama
 */
public class Altura {
    private float altura;

    public Altura() {
    }

    public Altura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "altura=" + altura;
    }
}
