package javaclassesobjectsmethods;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {
    public void run() throws IOException, ParseException {
//      throw new IOException();
      
      throw new ParseException("Error in command list", 2);
    }
    
    public void input() throws IOException, FileNotFoundException {
    }
    //  implementation would need to put file not found first
    //    in catch block
    //    because file not found is a type of IOException
    //**child exception must be handled first because of polymorphism
}
