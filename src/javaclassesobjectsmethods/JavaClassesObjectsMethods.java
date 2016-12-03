package javaclassesobjectsmethods;

// SORTED MAPS

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        
        testMap(hashMap);
        testMap(linkedHashMap); 
            // maintains order that items were put in 
        testMap(treeMap);
            // orders keys "natural order"
    }
    
    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(8, "eel");
        map.put(4, "dog");
        map.put(0, "mosquito");
        map.put(16, "swan");
        
        for (Integer key: map.keySet()) {
            String value = map.get(key);
            
            System.out.println(key + ": " + value);     
        }
    }
    
}