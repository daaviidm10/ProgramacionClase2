package boletin4_1;

import java.util.Scanner;

/**
 *
 * @author dmama
 */
public class Boletin4_1 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce o titulo");
        String t= sc.nextLine();
        System.out.println("Introduce o autor");
        String au= sc.nextLine();
        System.out.println("Introduce o ano de publicacion");
        String a= sc.nextLine();
        System.out.println("Introduce o numero de pags");
        String np= sc.nextLine();
        System.out.println("Introduce a valoracion");
        String val= sc.nextLine();
        System.out.println("Info: "+t+", "+au+", "+a+", "+np+", "+val+".");
    }

}
