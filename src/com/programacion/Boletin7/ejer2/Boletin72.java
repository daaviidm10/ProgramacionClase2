package boletin7.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1b
 */
public class Boletin72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        operacion obx=new operacion();
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
        obx.operacion(num1, num2, num2, num2);
    }

}
