package com.programacion.Boletin8.ejer2;

public class Boletin82 {

    public static void main(String[] args) {
        areas obx = new areas();

        String numero = JOptionPane.showInputDialog("Introducir numero");
        do{
            switch (numero){

                case "1":obx.areaCuadrado();
                    break;
                case "2":obx.areaTriangulo();
                    break;
                case "3":obx.areaCirculo();
                    break;
                case "4": System.out.println("sale del switch");
                default: System.out.println("Opción incorrecta");

            }

        }while(numero.equals("4")==false);
    }

}
