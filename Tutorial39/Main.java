/**
 *
 * @author Marcelo
 */
public class Main {
    
    public static void main (String args[]) {
        Persona marcelo = new Persona("Marcelo", "Fuentes", 25);
        BinManager bin = new BinManager();
        
        bin.writeObject(marcelo);
        
        Persona readed = (Persona) bin.readObject();
        
        System.out.println(
            readed.getNombre() + " --> " + 
            readed.getApellido() + " --> " + 
            readed.getEdad() + " --> " + 
            readed.getExcluded()
        );
    }
}
