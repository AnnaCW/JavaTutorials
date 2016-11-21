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
        
        try (FileInputStream fi = new FileInputStream("people.bin"); ObjectInputStream os = new ObjectInputStream(fi)) {
            
            
            Person person1 = (Person)os.readObject();
            Person person2 = (Person)os.readObject();
            
            System.out.println(person1);
            System.out.println(person2);
        
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
