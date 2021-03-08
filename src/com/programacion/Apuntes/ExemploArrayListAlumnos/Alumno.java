/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylistalumnos;

/**
 *
 * @author dam1b
 */
public class Alumno implements Comparable <Alumno>{
    private String nome;
    private int nota;
    private String dni;

    public Alumno(){

    }
    public Alumno(String nome, int nota, String dni) {
        this.nome = nome;
        this.nota = nota;
        this.dni = dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", nota=" + nota + ", dni=" + dni + '}';
    }



    @Override
    public int compareTo(Alumno o) {
        if((this.dni.compareToIgnoreCase(o.dni))>0)
            return 1;
        else if((this.dni.compareToIgnoreCase(o.dni))<0)
            return -1;
        else
            return 0;
    }

}
