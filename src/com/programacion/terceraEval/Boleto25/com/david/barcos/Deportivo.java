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
public class Deportivo extends Barco{
    private int Potencia;

    public Deportivo(int Potencia, String matrícula, float eslora, int días) {
        super(matrícula, eslora, días);
        this.Potencia = Potencia;
    }

    public int getPotencia() {
        return Potencia;
    }

    private float diaeslora(){
        return super.getDías()*10*super.getEslora();
    }
    private int calPotencia(){
        return Potencia*2;
    }
    private float total(){

        return diaeslora()+calPotencia();
    }

    @Override
    public String toString() {
        return "Factura:\nENBARCACIÓN DEPORTIVA\n"+"Matricula= "+super.getMatrícula()+"\nDias aluguer= "+super.getDías()+"\n"+"Metros de slora= "+super.getEslora()+
                "m\n"+"Dias * 10 * slora= "+diaeslora()+"€"+"\nCV= "+Potencia+"\nPrecio CV= 2€\nPrecio Total CV= "+calPotencia()+"€\nTOTAL= "+total()+"€";
    }
}



