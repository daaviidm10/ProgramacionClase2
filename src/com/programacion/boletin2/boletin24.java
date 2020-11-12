package ejercicio2.pkg4;

import java.util.Scanner;

/**
 *
 * @author dam1b
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1,num2,suma,resta,producto,cociente;
        System.out.println("Teclea o 1º numero: ");
        num1 =sc.nextFloat();
        System.out.println("Teclea o 2º numero: ");
        num2 =sc.nextFloat();
        suma = num1+num2;
        resta = num1-num2;
        producto = num1*num2;
        cociente = num1/num2;
        System.out.println("suma= " + suma + "\n resta = "+ resta + "\n producto = "+producto + "\n cociente =" + cociente);
    }

}
