package javaclassesobjectsmethods;

//HANDLING EXCEPTIONS - BASICS

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaClassesObjectsMethods {
    
// THIRD WAY TO HANDLE EXCEPTIONS 
// here we throw the error in openFile, catch it in main

    
    public static void main(String[] args) {
        try {
            openFile();
        } catch (FileNotFoundException ex) {
           System.out.println("Could not open file");
        }
    }
    
    public static void openFile() throws FileNotFoundException {
        File file = new File("text.txt");
        
        FileReader fr = new FileReader(file);
    }

    
// SECOND WAY TO HANDLE EXCEPTIONS : try/catch block 
//    not throwing out of main    
//    providing code that will run if an exception is found
    
//    public static void main(String[] args) {
//        File file = new File("test.txt");
//        
//        try {
//            FileReader fr = new FileReader(file);            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(JavaClassesObjectsMethods.class.getName()).log(Level.SEVERE, null, ex);
//            //prints stack trace by default but can put anything here
//        }
//        
//        System.out.println("Finished");
//        // this will run even if an exception is caught
//    }
    
//FIRST WAY TO HANDLE EXCEPTIONS: throw file not found out of main
    
//    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("text.txt");
//        
//        FileReader fr = new FileReader(file);
//    }
}

//exceptions are objects derived from the exception class