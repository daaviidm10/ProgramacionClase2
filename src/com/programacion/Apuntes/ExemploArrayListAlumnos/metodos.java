/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylistalumnos;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1b
 */
public class metodos {
    public static void engadirElemento(ArrayList<Alumno> listaAlum){
        Alumno ele= pedirAlumno("alumno a pedir: ");
        listaAlum.add(ele);
    }

    public static Alumno pedirAlumno(String mensaxe){
        String nome = JOptionPane.showInputDialog("nome");
        int nota = Integer.parseInt(JOptionPane.showInputDialog("nota: "));
        String dni = JOptionPane.showInputDialog("dni: ");
        Alumno al = new Alumno(nome,nota,dni);
        return al;
    }

    public static void amosar(ArrayList<Alumno> listaAlum){
        for(Alumno ele: listaAlum){
            System.out.println(ele);
//Este foreach va recorriendo toda la lista(listaAlum) y va metiendo los datos en "ele".
//luego lo visualizamos con el sout
        }
    }
    public static void amosarfor(ArrayList<Alumno> listaAlum){
        for(int i=0; i<listaAlum.size(); i++){
            System.out.println(listaAlum.toString());
        }
    }
    public void amosarIterator(){
        Iterator it = listaAlum.iterator();
        int elemento;
        while(it.hasNext()){
            elemento= (int) it.next();
            System.out.println("// "+elemento);
        }
    }

    public static void consultarAlumno(ArrayList<Alumno> listaAlum){
        int atopado= 0; //non está na lista
        String pedirDni = JOptionPane.showInputDialog("Dime o Dni:");
        for(int i=0; i<listaAlum.size();i++){
            if (pedirDni.equalsIgnoreCase(listaAlum.get(i).getDni())){
                atopado=1;
                System.out.println("O alumno está na lista"+listaAlum.get(i).toString());
            }

        }if(atopado==0){
            System.out.println("O alumno non está na lista");

        }
    }
    public static void eliminarAlumno(ArrayList<Alumno> listaAlum){

        int atopado = 0; //no está
        String pedirDni = JOptionPane.showInputDialog("Dime o Dni:");
        Iterator it = listaAlum.iterator();
        while(it.hasNext()){
            Alumno al = (Alumno) it.next();
            if (al.getDni().equalsIgnoreCase(pedirDni)){
                it.remove();
                atopado=1;

            }

        }
        if(atopado==0){
            System.out.println("O alumno non está na lista");

        }
    }
}