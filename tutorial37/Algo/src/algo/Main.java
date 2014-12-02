package algo;

import it.sauronsoftware.junique.JUnique;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */

public class Main {

    public static void main(String[] args) {
        try{
            JUnique.acquireLock("krupf");
            while(true){
                int i = JOptionPane.showConfirmDialog(null, "Terminar?", "titulo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(i == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            System.exit(0);
        }
    }
}