package com.programacion.segundaEval.Boletin14;

public class Bol14 {
    public static void main(String[] args) {
        ConvetirTemp temperatura1 = new ConvetirTemp();
        ConvetirTemp temperatura2 = new ConvetirTemp();
        try {
            System.out.println("Grados Farenheit "+temperatura1.centigradosAFarenheit(78));
        }catch (TemperaturaErradaException error){
            System.out.println(error.getMessage());
        }
        temperatura2.centigradosAReamur(46F);
    }
}
}
