
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Marcelo
 */
public class BinManager {
    
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    
    
    public void writeObject (Object object) {
        try {
            oos = new ObjectOutputStream(new FileOutputStream("file.bin"));
            oos.writeObject(object);
            oos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Object readObject () {
        Object object;
        
        try {
            ois = new ObjectInputStream(new FileInputStream("file.bin"));
            object = ois.readObject();
            
            return object;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return null;
    }
}