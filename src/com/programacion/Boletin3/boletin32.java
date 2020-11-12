package boletin3_2;

import java.util.Scanner;

/**
 *
 * @author dam1b
 */
public class Boletin3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float grados,kelvin,farenheit;
        System.out.println("Teclea os grados centígrados: ");
        grados =sc.nextFloat();
        kelvin = grados + 273;
        farenheit = grados * 1.8f + 32;
        System.out.println("Os grados kelvin son = " + kelvin);
        System.out.println("Os grados farenheit son = " + farenheit);
    }

}
