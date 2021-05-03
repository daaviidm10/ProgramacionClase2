/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.barcos;

/**
 *
 * @author dma
 */
public class Velero extends Barco{
    private int mastil;

    public Velero(int mastil, String matrícula, float eslora, int días) {
        super(matrícula, eslora, días);
        this.mastil = mastil;
    }

    public int calcularMastil(){
        return this.mastil*8;

    }

    public int getMastil() {
        return mastil;
    }
    public float diaeslora(){
        return super.getDías()*10*super.getEslora();
    }


    @Override
    public String toString() {
        return "Factura:\n"+"Matricula= "+ super.getMatrícula()+"\nDias aluguer= "+super.getDías()+"\n"+"Metros de slora= "+super.getEslora()+
                "m\n"+"Precio a pagar por aluguer(Días * 10 * eslora)= "+diaeslora()+"€" + "\nPrecio total a pagar= "+diaeslora()*calcularMastil()+"€";
    }



