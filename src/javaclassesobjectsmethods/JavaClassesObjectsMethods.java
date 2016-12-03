package javaclassesobjectsmethods;

// HASH MAP

import java.util.HashMap;
import java.util.Map;


public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(2, "Two");
        map.put(1, "One");
        
//      map.put(6, "Hello");
//      can't have duplicate keys
//      this overwrites the previous 6

        String text = map.get(6);
        
        System.out.println(text);
        
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println(key + ": " + value);
        }

    }
    
}