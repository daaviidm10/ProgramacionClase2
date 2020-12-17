package boletín3_1;

import java.util.Scanner;

public class Boletín3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float ptarifa,ppagado,porcentaxe;
        System.out.println("Teclea o precio pagado: ");
        ppagado =sc.nextFloat();
        System.out.println("Teclea a tarifa: ");
        ptarifa =sc.nextFloat();
        porcentaxe = (ptarifa-ppagado)*100/ptarifa;
        System.out.println("O porcentaxe e = " + porcentaxe);
    }

}
