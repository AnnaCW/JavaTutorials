package javaclassesobjectsmethods;

//READING FILES WITH FILE READER / BUFFERED READER
//this is old way; better ways introduced starting w/ Java 7

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        
       File file = new File("example.txt");
       BufferedReader br = null;

        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
              
            String line;
            
            while( (line = br.readLine()) != null ) {
               System.out.println(line);
            }
              
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found: " + file.toString());
        } catch (IOException ex) {
            System.out.println("Cannot Read File: " + file.toString());
        }
        
        finally {
          try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Unable to close file: " + file.toString());
            } catch(NullPointerException ex) {
                // file was probably never opened           
            }
        }
          // finally block will be executed even if exceptions are thrown          
    }  
}
