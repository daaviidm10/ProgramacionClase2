package boletin73;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1b
 */
public class Boletin73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        signo obx=new signo();
        int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        obx.simbolo(num);    }

}
