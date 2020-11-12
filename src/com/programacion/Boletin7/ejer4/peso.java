package boletin74;

/**
 *
 * @author dam1b
 */
public class peso {
    public void peso(String nome1, String nome2, int peso1, int peso2, int diferenza){
        if (peso1>peso2){
            diferenza=peso1-peso2;
            System.out.println(nome1+" pesa máis que "+nome2+" e a diferencia é de "+diferenza);
        }
        else{
            diferenza=peso2-peso1;
            System.out.println(nome2+" pesa máis que "+nome1+" e a diferencia é de "+diferenza);
        }
    }
}
