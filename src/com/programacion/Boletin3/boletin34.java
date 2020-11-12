package boletin3_4;

import java.util.Scanner;

/**
 *
 * @author dam1b
 */
public class Boletin3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total,b100,b20,b5,m1,r1,r2,r3;
        System.out.println("Teclea o total: ");
        total =sc.nextInt();
        b100 = total/100;
        r1 = total%100;
        b20 = r1/20;
        r2 = r1%20;
        b5 = r2/5;
        r3 = r2%5;
        System.out.println("Os billetes son = " + " de 100=" + b100 + " de 20="+ b20 + " de 5=" +b5+ " de 1=" + r3);
    }

}
