/**
 *
 * @author dam1b
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float euros,cambio,dolares;
        System.out.println("Teclea os euros: ");
        euros =sc.nextFloat();
        System.out.println("Teclea os cambio: ");
        cambio =sc.nextFloat();
        dolares = euros*cambio;
        System.out.println("dolares= " + dolares);
    }

}
