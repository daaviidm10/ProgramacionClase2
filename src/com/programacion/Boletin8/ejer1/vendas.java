package boletin81;



public class vendas {
    public void vendas (int venda, String artigoconsumo){

        if (venda<=100) {
            System.out.println("baixo");
        }
        else if (venda>100&&venda<=500){
            System.out.println("medio");
        }
        else if(venda<500&&venda<=1000){
            System.out.println("O número 3 é o maior");
        }
        else if (venda>1000){
            System.out.println("primeira necesidade");
        }
    }

}

