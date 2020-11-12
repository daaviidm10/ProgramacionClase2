package boletin75;

/**
 *
 * @author dam1b
 */
public class nums {
    public void nums (int num1, int num2, int num3){

        if (num1>num2&&num1>num3) {
            System.out.println("O número 1 é o maior");
        }
        else if (num2>num1&&num2>num3){
            System.out.println("O número 2 é o maior");
        }
        else if(num3>num1&&num3>num2){
            System.out.println("O número 3 é o maior");
        }
        else if (num1==num2&&num2==num3){
            System.out.println("Os números son iguais");
        }
    }
}
