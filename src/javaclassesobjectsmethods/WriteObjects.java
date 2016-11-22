package javaclassesobjectsmethods;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

//public class WriteObjects {
//    public static void main (String[] args) {
//        System.out.println("Writing objects...");
//        
//        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"))) {
//                     
//            Person person = new Person(7, "Bob");
//            Person.setCount(88);  
////                setting for all objects in class because static
////                does not get serialized
//            os.writeObject(person);
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(WriteObjects.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(WriteObjects.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}
