package boletin5;

/**
 *
 * @author dmama
 */
//atributos
public class Consumo {
    public float kilometros;
    private float litroscombustible;
    public float velMedia;
    public float prezogasolina;
    public float tempo;
    public float consumomedio;

    public Consumo (){
    }
    public Consumo (float km, float litros, float vMed, float pGas){
        kilometros = km;
        litroscombustible = litros;
        velMedia = vMed;
        prezogasolina = pGas;

    }
    //metodos
    public float gettempo (){
        tempo = kilometros/velMedia;
        return tempo;
    }
    public void setKm (float km){
        kilometros = km;
    }
    public float getKm (float km){
        return kilometros;
    }
    public void setlitros (float litros){
        litroscombustible = litros;
    }
    public float getlitros (){
        return litroscombustible;
    }



    public float getconsumomedio () {
        return consumomedio = litroscombustible*100/kilometros;

    }
    public void consumoeuros (){
        float consum = getconsumomedio()*prezogasolina;
        System.out.println("Consumo medio= "+consum);
    }




    public void setvMedia (float vMed){
        velMedia = vMed;
    }
    public void setprezogasolina (float pGas){
        prezogasolina = pGas;
    }

    float consumoEuros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
