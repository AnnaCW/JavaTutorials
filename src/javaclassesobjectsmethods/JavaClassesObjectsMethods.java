package javaclassesobjectsmethods;

// SETS

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        
//      HashSet does not retain order
//        Set<String> set1 = new HashSet<String>();
        
//      LinkedHashSet does retain order
//        Set<String> set1 = new LinkedHashSet<String>();
        
//      TreeSet sorts in natural order
        Set<String> set1 = new TreeSet<String>();
        
        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        
        //Adding duplicate item does nothing
        set1.add("mouse");
        
        System.out.println(set1);

        //Iteration 
        
        for(String element: set1) {
            System.out.println(element);
        }
        
        //Does set contain a given item? 
        if(set1.contains("addvark")) {
            System.out.println("Contains ardvark");
        }
        
        if(set1.contains("cat")) {
            System.out.println("Contains cat");
        }
        
        //IsEmpty? 
        if (set1.isEmpty()) {
            System.out.println("Set is empty");
        }
    
        
        Set<String> set2 = new TreeSet<String>();
        
        set2.add("dog");
        set2.add("cat");
        set2.add("giraffe");
        set2.add("donkey");
        set2.add("eel");
        
    /////////   INTERSECTION //////
        
        Set<String> intersection = new HashSet<>(set1);
        
        intersection.retainAll(set2);
        
        System.out.println(intersection);
        
    /////////   DIFFERENCE //////
    
        Set<String> difference = new HashSet<>(set1);
        
        difference.removeAll(set2);

        System.out.println(difference);

    }   
}