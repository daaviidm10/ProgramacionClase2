/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author dmama
 */
public class Boletin15 {

    public static void main(String[] args) {
        Numero m = new Numero();

        //EJERCICIO 1

        double []numeros={m.numeroAleatorioDouble(),m.numeroAleatorioDouble(),m.numeroAleatorioDouble(),m.numeroAleatorioDouble(),m.numeroAleatorioDouble(),m.numeroAleatorioDouble()};
        m.mostrarArrayD(numeros);
        m.mostrarArraydelReves(numeros);
        m.mostrarArrayD(numeros);

        //EJERCICIO 2 y 3
        String []nombreAlumnos=new String [Integer.parseInt(JOptionPane.showInputDialog("Numero de alumnos"))];
        int []notas={m.numeroAleatorioInt(),m.numeroAleatorioInt(),m.numeroAleatorioInt(),m.numeroAleatorioInt(),m.numeroAleatorioInt()};
        int casos;
        do{
            casos=Integer.parseInt(JOptionPane.showInputDialog("Menu:\n0 Salir\n1 Crear lista alumnos\n2 Visualizar el numero de alumnos aprobados y suspensos"
                    + "\n3 Mostrar nota media de la clase\n4 Mostrar la mayor nota\n5 Nota de un alumno determinado\n6 Lista de alumnos aprobados"));
            switch(casos){
                case 0:System.exit(0);
                    break;
                case 1:  m.crearMatriz(nombreAlumnos);
                    break;
                case 2:  m.mostrarNotas(notas);
                    break;
                case 3:  m.calcularMedia(notas);
                    break;
                case 4:  m.notaMayor(notas);
                    break;
                case 5:  m.verNotaAlumno(notas, nombreAlumnos);
                    break;
                case 6: m.alumnosAprobados(notas, nombreAlumnos);
                    break;
                case 7: m.ordenarDeMenoraMayor(notas, nombreAlumnos);
                    break;
                case 8: m.mostrarNotasyNombre(notas, nombreAlumnos);
                    break;
            }
        }while(casos!=0);

        //EJERCICIO 4
        int opcion2;
        opcion2 = m.calcularDNI();
        switch (opcion2) {
            case 0:
                System.out.println("Letra: T");
                break;
            case 1:
                System.out.println("Letra: R");
                break;
            case 2:
                System.out.println("Letra: W");
                break;
            case 3:
                System.out.println("Letra: A");
                break;
            case 4:
                System.out.println("Letra: G");
                break;
            case 5:
                System.out.println("Letra: M");
                break;
            case 6:
                System.out.println("Letra: Y");
                break;
            case 7:
                System.out.println("Letra: F");
                break;
            case 8:
                System.out.println("Letra: P");
                break;
            case 9:
                System.out.println("Letra: D");
                break;
            case 10:
                System.out.println("Letra: X");
                break;
            case 11:
                System.out.println("Letra: B");
                break;
            case 12:
                System.out.println("Letra: N");
                break;
            case 13:
                System.out.println("Letra: J");
                break;
            case 14:
                System.out.println("Letra: Z");
                break;
            case 15:
                System.out.println("Letra: S");
                break;
            case 16:
                System.out.println("Letra: Q");
                break;
            case 17:
                System.out.println("Letra: V");
                break;
            case 18:
                System.out.println("Letra: H");
                break;
            case 19:
                System.out.println("Letra: L");
                break;
            case 20:
                System.out.println("Letra: C");
                break;
            case 21:
                System.out.println("Letra: K");
                break;
            case 22:
                System.out.println("Letra: E");
                break;
        }
    }
}