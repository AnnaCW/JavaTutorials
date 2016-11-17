package javaclassesobjectsmethods;

//WRITING TEXT FILES

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        
        File file = new File("writer.txt");
//            this file will appear in main project folder
//            running again will make any changes to file
        
        try(BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write("This is line 1");
            br.newLine();
            br.write("This is line 2");
            br.newLine();
            br.write("Last line");
            
        }  catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }

    }
}



