package javaclassesobjectsmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadObjects {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Reading objects....");
        
        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("test.ser"))) {
            
            Person person = (Person)os.readObject();
            System.out.println(person);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
