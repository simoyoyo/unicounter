package contatoreuniversale;

/**
 *Questa classe dovrebbe fornire tutte le funzionalità per 
 * il funzionamento di un contatore universale da usare in tutti i possibili
 * cicli.
 * 
 * @author Simoyoyo
 * @author Piffy
 */

//TODO Implementare Comparable

public class ContatoreUniversale {

    int x;

    //TODO Contatore con Inizializzatore
    
    /**
     * Costruttore standard: inizializza a zero
     */
    public ContatoreUniversale() {
        x=0;
    }
    
    //TODO Incrementa() 
    public void Incrementa(){
        x++;
    }
    
    //TODO Incrementa(int incremento) 
    
    //TODO ResetToInitialvalue (req. new attribute)
    
    /**
     * 
     * @return il valore di x convertito in Stringa 
     */
    @Override
    public String toString() {
        return ""+x;
    }
    
    public static void main(String args[]) {
    //Test of counter
        ContatoreUniversale c = new ContatoreUniversale();
        System.out.println("Valore (dovrebbe essere 0):"+c);
    //Test of Incrementa
        c.Incrementa();
        System.out.println("Valore (dovrebbe essere 1):"+c);
    //Test of Incrementa con quantità di incremento    
        
    //Test of Contatore con Inizializzatore
        
    //Test of Comparable interface
        
    //Test of ResetToInitialvalue()    
    }
}
