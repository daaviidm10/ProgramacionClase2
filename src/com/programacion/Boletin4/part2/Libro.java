package boletin4_1;

/**
 *
 * @author dmama
 */

public class Libro {

    public String titulo;
    private String autor;
    public int ano;
    public short numpaginas;
    public float valoracion;

    public Libro (){

    }
    public Libro (String t, String au, int a, short np, float val){
        titulo = t;
        autor = au;
        ano = a;
        numpaginas = np;
        valoracion = val;
    }
    public void setTitulo (String t){
        titulo = t;
    }
    public String getTitulo (String t){
        return titulo;
    }
    public void setAutor (String au){
        autor = au;
    }
    public String getAutor (){
        return autor;
    }
    public void setAno (int a){
        ano = a;
    }
    public int getAno (){
        return ano;
    }
    public void setNumpaginas (short np){
        numpaginas = np;
    }
    public short getNumpaginas (){
        return numpaginas;
    }
    public void setValoracion (float val){
        valoracion = val;
    }
    public float getValoracion (){
        return valoracion;
    }
}

