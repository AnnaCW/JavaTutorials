package javaclassesobjectsmethods;

//USING GENERIC CLASSES - ArrayList

import java.util.ArrayList;

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
 
//  MODERN STYLE
        ArrayList<String> strings = new ArrayList<>();
        
        strings.add("cat");
        strings.add("dog");
        strings.add("bird");
        
        String animal = strings.get(1);
        
        System.out.println(strings);
        System.out.println(animal);
                
//  BEFORE JAVA ~5 (introduced generics)
       ArrayList oldList = new ArrayList();
       
       oldList.add("apple");
       oldList.add("banana");
       
       String fruit = (String)oldList.get(1);
       System.out.println(fruit);
    }
      
}