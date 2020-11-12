package boletin75;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1b
 */
public class Boletin75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nums obx=new nums();
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
        int num3=Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer número"));
        obx.nums(num1, num2, num3);
    }

}