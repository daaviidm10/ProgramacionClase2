package exemploarrays.paquete1;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1b
 */
public class metodos {
    public void amosarArray(float[]lista){
        for(int i=0;i<lista.length;i++){
            System.out.println("temperatura "+(i+1)+"----"+lista[i]);

        }
    }
    public void amosarArrayForeach(float[]lista){
        for(float tempe:lista){
            System.out.println("Temperatura -->"+tempe);

        }
    }
    public void ordenar(float[]lista){
        Arrays.sort(lista);

    }
    public void ordenarDirecto (float []lista){
        float aux;
        for (int i=0; i<lista.length-1;i++){
            for(int j=i+1;j<lista.length;j++){
                if(lista[i]<lista[j]){
                    aux = lista[i];
                    lista[i]=lista[j];
                    lista[j]=aux;
                }
            }
        }
    }
    public void busqueda (float []lista){
        int numero;
        int atopada=0;//non está na lista.
        numero= Integer.parseInt(JOptionPane.showInputDialog("Inserte el elemento"));
        for(int i=0;i<lista.length;i++){
            if (numero == lista[i]){
                System.out.println("El número "+ numero +" está en la lista");
                atopada=1;
                break;
            }

        }
        if(atopada==0){
            System.out.println("Non está na lista");
        }
    }
    public void busquedaElementos (float []lista){
        float elebus = Float.parseFloat(JOptionPane.showInputDialog("que numero queres"));
        int j=0, atopado=0;//atopado=0 non está na lista.
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte el elemento"));
        for(int i=0;i<lista.length;i++){
            if (numero == lista[i]){
                System.out.println("El número "+ numero +" está en la lista");
                atopado=1;
                break;
            }

        }
        if(atopado==0){
            System.out.println("Non está na lista");
        }
    }


}
