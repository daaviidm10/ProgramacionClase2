package com.programacion.Boletin9.ejer5;

public class Soldo {
    public int traballadormil= 0, traballadornonmil= 0;
    public void soldoTraballa(){
        float soldo;
        do{
            soldo=Float.parseFloat(JOptionPane.showInputDialog("Inserta o soldo"));
            if(soldo>1000 && soldo<=1750){
                traballadormil++;
            }
            else if (soldo>0 && soldo<1000){
                traballadornonmil++;
            }
        }while(soldo!=0);
        System.out.println("Cantidade de traballadoresmil="+traballadormil);
        System.out.println("Porcentaxe de traballador non mil=" +(traballadornonmil*100/(traballadornonmil+traballadormil)));
    }
}
