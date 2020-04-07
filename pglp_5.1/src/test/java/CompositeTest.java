
import fr.uvsq.pglp_5.CompositePersonnel;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author andri
 */
public class CompositeTest {
    
    @Test
    public void personnelTest(){
        
        ObjectOutputStream oos = null;
        
        boolean comp = true;
        
        try
        {
            final FileOutputStream fichier = new FileOutputStream("Composite.ser");
            oos = new ObjectOutputStream(fichier);
            CompositePersonnel compositePersonnel = new CompositePersonnel("Groupe  1  ");
            oos.writeObject(compositePersonnel);
            oos.close();
            comp = true;
            
        }
        catch(IOException ex){
            ex.printStackTrace();
            comp = false;
        }
        
        assertTrue("Test de Sérialisation de COmposite OK ", true);
    }
         
}
