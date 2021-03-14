/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import javax.swing.JOptionPane;


public class Numero {
    //EJERCICIO 1
    public double numeroAleatorioDouble() {
        double num = Math.random() * 49 + 1;
        return num;
    }

    public void mostrarArrayD(double[] lista) {

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Número " + (i + 1) + "->" + lista[i]);
        }
    }

    public void mostrarArraydelReves(double[] lista) {
        double aux;
        for (int i = 0; i < lista.length / 2; i++) {
            aux = lista[i];
            lista[i] = lista[lista.length - 1 - i];
            lista[lista.length - 1 - i] = aux;
        }
    }

    //EJERCICIO 2
    public int numeroAleatorioInt() {
        int num = (int) Math.floor(Math.random() * 10);
        return num;
    }

    public void mostrarNotas(int[] lista) {
        int suspenso = 0, aprovado = 0, sinNota = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] >= 0 && lista[i] < 5) {
                suspenso++;
            } else if (lista[i] >= 5 && lista[i] <= 10) {
                aprovado++;
            } else
                sinNota++;
        }
        System.out.println("Alumnos:\nAprobados= " + aprovado + "\nSuspensos= " + suspenso + "\nSin nota= " + sinNota);
    }

    public void calcularMedia(int[] lista) {
        float notaMedia, aux = 0;
        for (int i = 0; i < lista.length; i++) {
            aux = aux + lista[i];

        }
        notaMedia = aux / 5;
        System.out.println("La nota media es: " + notaMedia);
    }

    public void notaMayor(int[] lista) {
        int notaMayor = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > notaMayor) {
                notaMayor = lista[i];
            }
        }
        System.out.println(notaMayor);
    }

    //EJERCICIO 3
    public String pedirNombres() {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno");
        return nombre;
    }

    public void verNotaAlumno(int[] notas, String[] nombres) {
        String nombreBusqueda = pedirNombres();
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < nombres.length; j++) {
                if (i == j) {
                    if (nombres[j].equals(nombreBusqueda))
                        System.out.println("Nombre: " + nombres[j] + " Nota: " + notas[i]);
                }
            }
        }
    }

    public String[] crearMatriz(String[] nombres) {

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = pedirNombres();
        }
        return nombres;
    }

    public void alumnosAprobados(int[] notas, String[] nombres) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println("Nombre: " + nombres[i] + " Nota: " + notas[i]);
            }
        }

    }

    public void ordenarDeMenoraMayor(int[] notas, String[] nombres) {
        int auxNotas;
        String auxNombres;
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    auxNotas = notas[i];
                    notas[i] = notas[j];
                    notas[j] = auxNotas;
                    auxNombres = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = auxNombres;
                }
            }
        }
    }

    public void mostrarNotasyNombre(int[] notas, String[] nombres) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nombre: " + nombres[i] + " Nota: " + notas[i]);
        }
    }
    //Ejercicio 4

    public int calcularDNI() {
        String dni;
        int letraDNI = 0;
        do {
            dni = JOptionPane.showInputDialog("Introduce tu DNI");
            if (dni.length() == 8) {
                letraDNI = Integer.parseInt(dni) % 23;
            } else
                System.out.println("DNI incorrecto");
        } while (dni.length() != 8);
        return letraDNI;
    }
}