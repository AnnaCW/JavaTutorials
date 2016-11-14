package javaclassesobjectsmethods;

//TRY - WITH RESOURCES

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
   

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        
        File file = new File("nosuchfile.txt");
                
        try (BufferedReader br = new BufferedReader(new FileReader(file)) ) {
            
        } catch (FileNotFoundException ex) {
            System.out.println("Can't find file " + file.toString());
        } catch (IOException ex) {
            System.out.println("Unable to read file " + file.toString());
        }
                
    }  
}

//try with resources was introduced in java 7

