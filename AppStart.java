
/**
 * Escreva uma descrição da classe AppStart aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AppStart
{
    private static ShippingCompany shippingCompany;
    
    public static void main(String args[]){
        shippingCompany = new ShippingCompany("RELIABLE-MOVING");
        shippingCompany.add(new AirTransportation("BOEING", 2));
        shippingCompany.add(new AirTransportation("ac-30", 2));
        shippingCompany.add(new GroundTransportation("NEZ"));
        shippingCompany.add(new Van(2, "ABC"));
        shippingCompany.add(new Lorry(2, 2, "CBE"));
        
        for(Transport transport : shippingCompany){
            System.out.println(transport.toString());
        }
    }
}
