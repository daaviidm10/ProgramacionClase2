package exemploexcepcións;


/**
 *
 * @author dam1b
 */
public class ExemploExcepcipóns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Division obxDiv = new Division();

        try {
            obxDiv.dividirNovaExcepcion(6,3);
        } catch (NosaExcepcion ex) {
            System.out.println(ex.getMessage());
        }

    }

}