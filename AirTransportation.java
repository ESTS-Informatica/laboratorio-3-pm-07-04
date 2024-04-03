
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    
    private String name;
    private int numberOfContainers;
    
    public AirTransportation(String planeName, int containers){
        if(planeName != null){
            name = planeName;
        }
        
        if(containers > 0)
            numberOfContainers = containers;
        else
            numberOfContainers = 0;
        
        super.setFees(4.0);
    }
    
    public void setName(String planeName){
        name = planeName;
        
    }
    
    public String getName(){
        return name;
    }
    
    public void setNumberOfContainers(int containers){
        if(containers >= 0){
            numberOfContainers = containers;
        }
    }
    
    public int getNumberOfContainers(){
        return numberOfContainers;
    }
    
    public double getPriceWithFees() {     
        return super.getPriceWithFees();
    }
    
    public String getTransportType() {
        return "Transporte Aereo";
    }
    
    @Override 
    public String toString(){
        return super.toString() + "\nNome: " + name + "\nNº de contentores: " + numberOfContainers;
    }
}
