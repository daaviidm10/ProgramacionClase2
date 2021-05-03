/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.barcos;

/**
 *
 * @author dam1b
 */
public class Yate extends Barco{
    private int potencia;
    private int ncamarotes;

    public Yate(int potencia, int ncamarotes, String matrícula, float eslora, int días) {
        super(matrícula, eslora, días);
        this.potencia = potencia;
        this.ncamarotes = ncamarotes;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getNcamarotes() {
        return ncamarotes;
    }

    private float diaEslora(){
        return super.getDías()*10*super.getEslora();
    }
    private int calPotencia(){
        return potencia*2;
    }
    private int calCamarote(){
        return ncamarotes*25;
    }
    private float total(){

        return diaEslora()+calPotencia()+calCamarote();
    }

    @Override
    public String toString() {
        return "Factura:\nYATE\n"+"Matricula= "+super.getMatrícula()+"\nDias aluguer= "+super.getDías()+"\n"+"Metros de slora= "+super.getEslora()+
                "m\n"+"Dias * 10 * Eslora= "+diaEslora()+"€"+"\nCV= "+potencia+
                "\nPrecio CV= 2€\nPrecio Total CV= "+calPotencia()+"€\nCamarotes= "+ncamarotes+
                "\nPrecio Camarote= 25€\nPrecio Total Camarote= "+calCamarote()+"€\nTOTAL= "+total()+"€";
    }



}
