package boletin7;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1b
 */
public class Boletin7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        num obx = new num();
        int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número"));
        obx.amosarnum(num);


    }

}
