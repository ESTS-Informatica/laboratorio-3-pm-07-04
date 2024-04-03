import java.util.HashSet;
import java.util.ArrayList;

/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ShippingCompany extends HashSet<Transport>
{
    private String name;
    private ArrayList<Transport> inService;
    
    public ShippingCompany(String companyName){
        if(companyName != null)
            name = companyName;
        
        inService = new ArrayList<>();
    }
    
    public void addTransport(Transport transport){
        if(transport != null)
            inService.add(transport);
    }
    
    public boolean makeTransportation(String id, String origin, String destination, double price){
        Transport transport = getTransportation(id);
        
        if(transport != null && transport.isAvailable() == true){
            transport.setOrigin(origin);
            transport.setDestination(destination);
            transport.setPrice(price);
            transport.setAvailable(false);
            addTransport(transport);
            this.remove(transport);
            return true;
        }
        
        
        return false;
    }
    
    public boolean finalizeTransportation(String id){
        Transport transport = getTransportation(id);
        
        if(inService.contains(transport)){
            inService.remove(transport);
            transport.setOrigin("");
            transport.setDestination("");
            transport.setPrice(0.0);
            transport.setAvailable(true);
            this.add(transport);
            return true;
        }
        
        return false;
    }
    
    public String getName(){
        return name;
    }
    
    private Transport getTransportation(String id){
        for(Transport transport : this){
            if(transport.getId().equals(id))
                return transport;
        }
        
        return null;
    }
    
    @Override 
    public String toString(){
        String inServiceInfo = "";
        
        for(Transport transport : inService){
            inServiceInfo += transport.toString() + "\n";
        }
        
        return inServiceInfo;
    }
}
