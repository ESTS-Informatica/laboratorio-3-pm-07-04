
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
    private int trailers;
    private int numberOfPallets;
    
    public Lorry(int numberOfTrailers, int pallets, String plate){
        super(plate);
        
        if(numberOfTrailers > 0)
            trailers = numberOfTrailers;
        else 
            trailers = 0;
        
        if(pallets > 0)
            numberOfPallets = pallets;
        else
            numberOfPallets = 0;
            
    }
    
    public void setTrailers(int numberOfTrailers){
        if(numberOfTrailers >= 0)
            trailers = numberOfTrailers;
    }
    
    public int getTrailers(){
        return trailers;
    }
    
    public void setNumberOfPallets(int pallets){
        if(pallets >= 0)
            numberOfPallets = pallets;
    }
    
    public int getNumberOfPallets(){
        return numberOfPallets;
    }
    
    @Override 
    public String toString(){
        return super.toString();
    }
}
