package exemploexcepcións;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1b
 */
public class Division {
    private int numerador;
    private int denominador;
    public Division(){
    }
    public Division(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public void dividirSenCapturarExcepcións(int nume, int deno){
        System.out.println("resultado sen tratar excepcións"+nume/deno);
    }
    public void dividirCapturandoExcepcións(int deno){
        try{
            System.out.println("antes da división");
            int num = Integer.parseInt(JOptionPane.showInputDialog("numerador"));
            System.out.println("resultado tratando a excepción"+num/deno);
            System.out.println("despois da división");
        }catch(ArithmeticException e){
            System.out.println("erro1"+e.toString());
        }catch(Exception e){
            System.out.println("erro2"+e.getMessage());
        }

    }
    public void dividirUsandoFinally(int nume, int deno){
        try{
            System.out.println("antes da división");
            System.out.println("resultado tratando a excepción"+nume/deno);
            System.out.println("despois da división");
        }catch(ArithmeticException e){
            System.out.println("erro1"+e.toString());
        }catch(Exception e){
            System.out.println("erro2"+e.getMessage());
        }
        finally{
            System.out.println("dentro do finally");
        }
    }
    public void dividirPropagandoExcepcion(int nume, int deno) throws ArithmeticException{
        System.out.println("antes de propagar");
        if (deno==0)
            throw new ArithmeticException ();
        else
            System.out.println("resultado= "+ nume/deno);

    }
    public void dividirNovaExcepcion(int nume, int deno) throws NosaExcepcion{
        System.out.println("antes de propagar");
        if (deno==0)
            throw new NosaExcepcion ("Non dividir un enteiro entre 0");
        else
            System.out.println("resultado = "+ nume/deno);
    }
}
