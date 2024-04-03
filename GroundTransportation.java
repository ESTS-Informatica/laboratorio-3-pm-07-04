
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    
    private String licensePlate;
    
    public GroundTransportation(String plate){
        if(plate != null)
            licensePlate = plate;
            
        super.setFees(3.0);
    }
    
    public void setLicensePlate(String plate){
        if(plate != null)
            licensePlate = plate;
    }
    
    public String getLicensePlate(){
        return licensePlate;
    }
    
    public double getPriceWithFees() {     
        return super.getPriceWithFees();
    }
    
    public String getTransportType() {
        return "Transporte Terrestre";
    }
    
    @Override 
    public String toString(){
        return super.toString() + "\nMatricula: " + licensePlate;
    }
}
