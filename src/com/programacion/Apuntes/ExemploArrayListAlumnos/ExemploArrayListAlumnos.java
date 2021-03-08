 /*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
  */
 package exemploarraylistalumnos;

 import java.util.ArrayList;
 import javax.swing.JOptionPane;

 /**
  *
  * @author dam1b
  */
 public class ExemploArrayListAlumnos {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
         ArrayList<Alumno>listaAlum = new ArrayList <Alumno>();
         String opcion;
         do{
             opcion = JOptionPane.showInputDialog("Menú \n 1.-engadir elemento \n 2.- amosar \n 3.- consulta \n 4.-eliminar \n 5.- sair");
             switch(opcion){
                 case "1" : metodos.engadirElemento(listaAlum);
                     break;
                 case "2" : metodos.amosar(listaAlum);
                     break;
                 case "3" : metodos.consultarAlumno(listaAlum);
                     break;
                 case "4" : metodos.eliminarAlumno(listaAlum);
                     break;
                 case "5" : System.exit(0);

             }
         }while(!opcion.equalsIgnoreCase("3"));
     }

 }
