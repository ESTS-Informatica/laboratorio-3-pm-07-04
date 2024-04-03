
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation
{
    private int packages;
    
    public Van(int numberOfPackages, String plate){
        super(plate);
        
        if(numberOfPackages > 0)
            packages = numberOfPackages;
        else
            packages = 0;
    }
    
    public void setPackages(int numberOfPackages){
        if(numberOfPackages >= 0)
            packages = numberOfPackages;
    }
    
    @Override 
    public String toString(){
        return super.toString();
    }
}
