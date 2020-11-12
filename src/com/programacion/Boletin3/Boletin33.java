package boletin3_3;

import java.util.Scanner;

/**
 *
 * @author dam1b
 */
public class Boletin3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float b100,b20,b5,m1,total;
        System.out.println("Teclea os billetes de 100: ");
        b100 =sc.nextFloat();
        System.out.println("Teclea os billetes de 20: ");
        b20 =sc.nextFloat();
        System.out.println("Teclea os billetes de 5: ");
        b5 =sc.nextFloat();
        System.out.println("Teclea as moedas de 1: ");
        m1 =sc.nextFloat();
        total = b100*100 + b20*20 + b5*5 + m1*1;
        System.out.println("O total e = " + total);

    }

}
