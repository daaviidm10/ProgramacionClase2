package exemploexcepcións;

/**
 *
 * @author dam1b
 */
public class NosaExcepcion extends Exception{
    public NosaExcepcion() {
        super();
    }
    public NosaExcepcion (String message){
        super("tes un erro"+message);
    }
}
