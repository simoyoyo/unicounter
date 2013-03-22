package contatoreuniversale;

/**
 *Questa classe dovrebbe fornire tutte le funzionalità per 
 * il funzionamento di un contatore universale da usare in tutti i possibili
 * cicli.
 * 
 * @author Simoyoyo
 * @author Piffy
 */

//TODO Implementare Comparable-> Echo

public class ContatoreUniversale {

    int x;
    int y;

    //TODO Contatore con Inizializzatore -> Alpha   
    public ContatoreUniversale(int x) {
        this.x=x;   // Fatto da Bravo
        y=x;
    }
    /**
     * Costruttore standard: inizializza a zero
     */

    public ContatoreUniversale() {
        x=0;   //Alpha: è normale che sia gai stato fatto ?!
        y=0;
    }
                 public int compareTo(Object y) {
        ContatoreUniversale z= (ContatoreUniversale) y;
        return (int) (x-z.x);
    }
    //TODO Incrementa() -> Charlie
    
    //TODO Incrementa(int incremento) -> Delta
    public void Incrementa(int incremento){
        x+=incremento;
    }
    //TODO ResetToInitialvalue (req. new attribute) -> Bravo
    public void ResetToInitialvalue(){
        x=y;
    }
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

    //Test of Incrementa con quantità di incremento    
        c.Incrementa(7);
        System.out.println("Valore (dovrebbe essere 7):"+c);
    //Test of Contatore con Inizializzatore
        
    //Test of Comparable interface
                int ris;
        ContatoreUniversale z= new ContatoreUniversale();
        ContatoreUniversale y= new ContatoreUniversale();
        ris= z.compareTo(y);
        System.out.println(ris);
    //Test of ResetToInitialvalue()    
    }
}
