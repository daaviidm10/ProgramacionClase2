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
public class Correo {
    String contido;
    boolean lido;

    public Correo() {
    }

    public Correo(String contido, boolean lido) {
        this.contido = contido;
        this.lido = lido;
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }

    @Override
    public String toString() {
        return "Contenido= " + contido + ", leido= " + lido;
    }
}