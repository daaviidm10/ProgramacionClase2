package com.programacion.Boletin8.ejer2;

public class areas {
    String numero;

    public void areas (){
    }
    public void areaCuadrado(){
        float lado=Float.parseFloat(JOptionPane.showInputDialog("Introduce el lado"));
        System.out.println("Área= "+ Math.pow(lado, 2));
    }
    public void areaTriangulo(){
        float base=Float.parseFloat(JOptionPane.showInputDialog("Introduce la base"));
        float altura=Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura"));
        System.out.println("Área= "+ (base*altura/2));
    }
    public void areaCirculo(){
        float radio=Float.parseFloat(JOptionPane.showInputDialog("Introduce radio"));
        System.out.println("Área= "+ Math.PI*Math.pow(radio, 2));
    }


}