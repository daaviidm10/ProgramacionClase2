package boleto6;

/**
 *
 * @author dam1b
 */
public class Coche {
    private int velocidade ;

    //constructor
    public Coche(){
        velocidade =0 ;

    }


    //metodos
    public int getVelocidade (){

        return velocidade;

    }

    public void acelerar (int valor) {
        velocidade= velocidade + valor;
        System.out.println("A velocidade incrementada é de " + velocidade);
    }
    public void frenar (int menos) {
        velocidade= velocidade - menos;
        System.out.println("A velocidade decrementada é de " + velocidade);
    }

}