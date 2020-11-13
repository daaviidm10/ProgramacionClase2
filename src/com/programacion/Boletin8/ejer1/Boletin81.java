package boletin81;

import javax.swing.JOptionPane;

/**
 *
 * @author dmama
 */
public class Boletin81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vendas obx=new vendas();
        String artigoconsumo=JOptionPane.showInputDialog("Introduce el nombre del articulo");
        int venda=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de ventas"));
        obx.vendas(venda, artigoconsumo);
    }

}
