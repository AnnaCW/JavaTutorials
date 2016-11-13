package javaclassesobjectsmethods;

//MULTIPLE EXCEPTIONS

import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        Test test = new Test();
 
// OPTION 3 - catches any kind of exception - polymorphism
// ioexception, parse exception are children of exception parent class
          try {
            test.run();
          } catch (Exception e) {
              e.printStackTrace();
          }
        
// OPTION 2 - handles multiple exceptions in one block
//        try {
//          test.run();
//        } catch (IOException | ParseException e) {
//            e.printStackTrace();
//        }
        
//  OPTION 1
//        try {
//            test.run();
//        } catch (IOException ex) {
//            Logger.getLogger(JavaClassesObjectsMethods.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ParseException ex) {
//            System.out.println("couldn't parse file");
//        }
    }
    
}
