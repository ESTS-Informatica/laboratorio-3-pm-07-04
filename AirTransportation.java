
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    private static final double HONORARY = 0.04;
    
    private String name;
    private int numberOfContainers;
    
    public AirTransportation(String planeName, int containers){
        if(planeName != null){
            name = planeName;
        }
        
        if(containers >= 0){
            numberOfContainers = containers;
        }
    }
    
    public void setName(String planeName){
        if(planeName != null){
            name = planeName;
        }
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
}
