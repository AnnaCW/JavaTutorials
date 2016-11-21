package javaclassesobjectsmethods;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteObjects {
    public static void main (String[] args) {
        System.out.println("Writing objects...");
        
        Person[] people = {new Person(1, "Sue"), new Person(2, "Bob"), new Person(3, "Mike")};
        
        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
        
        for (Person person: people) {
                System.out.println(person);
            }
          
        try (FileOutputStream fs = new FileOutputStream("people.bin")) {
            
            ObjectOutputStream os = new ObjectOutputStream(fs);
            
            os.writeObject(people);
            
            os.writeObject(peopleList);
            
            os.writeInt(peopleList.size());
            
            for(Person person: peopleList) {
                os.writeObject(person);
            }
                    
            os.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WriteObjects.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WriteObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
