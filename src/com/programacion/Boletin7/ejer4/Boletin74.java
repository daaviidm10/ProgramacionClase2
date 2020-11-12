public class Boletin74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        peso obx=new peso();
        String nome1=JOptionPane.showInputDialog("Introduce o nome");
        int peso1=Integer.parseInt(JOptionPane.showInputDialog("Introduce o peso"));
        String nome2=JOptionPane.showInputDialog("Introduce o nome");
        int peso2=Integer.parseInt(JOptionPane.showInputDialog("Introduce o peso"));
        obx.peso(nome1, nome2, peso1, peso2, peso2);
    }

}
