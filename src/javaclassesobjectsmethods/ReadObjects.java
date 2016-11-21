package javaclassesobjectsmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadObjects {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Reading objects....");
        
        try (FileInputStream fi = new FileInputStream("people.bin"); ObjectInputStream os = new ObjectInputStream(fi)) {
            
            Person[] people = (Person[])os.readObject();
            
            ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();
            
            for (Person person: people) {
                System.out.println(person);
            }
            
            for (Person person: peopleList) {
                System.out.println(person);
            }
            
            int num = os.readInt();
            
            for(int i=0; i<num; i++) {
                Person person = (Person)os.readObject();
                System.out.println(person);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
