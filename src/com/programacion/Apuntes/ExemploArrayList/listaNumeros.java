package exemploarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1b
 */
public class listaNumeros {
    ArrayList <Integer> listaNumeros= new ArrayList();

    public void engadir(){
        int elemento= Integer.parseInt(JOptionPane.showInputDialog("dame un enteiro "));
        listaNumeros.add(elemento);
    }
    public void amosarFor(){
        for(int i =0; i<listaNumeros.size();i++){
            System.out.println(listaNumeros.get(i));
        }
    }
    public void amosarForEach(){
        for(Integer ele:listaNumeros)
            System.out.println("*" +ele);

    }
    public void amosarIterator(){


        Iterator it = listaNumeros.iterator();
        int elemento;
        while(it.hasNext()){
            elemento= (int) it.next();
            System.out.println("// "+elemento);
        }
    }
    public void eliminar(){
        int elementoEliminar = Integer.parseInt(JOptionPane.showInputDialog("elemento eliminar"));
        for (int i=0; i<listaNumeros.size();i++){
            if(listaNumeros.get(i)==elementoEliminar)
                listaNumeros.remove(i);
        }
    }

    void amosariterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void engadirPosicion(int pos){
        int elemento= Integer.parseInt(JOptionPane.showInputDialog("dame un enteiro "));
        listaNumeros.add(pos, elemento);
    }
    public void numerosPares(){
        int elemento = 0;
        for (int i=0; i<listaNumeros.size();i++){
            if(listaNumeros.get(i)%2==0)
                listaNumeros.remove(i);




        }
    }
}

