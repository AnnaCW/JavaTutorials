package javaclassesobjectsmethods;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

// USING CUSTOM OBJECTS IN SETS AND AS KEYS

class Person3 {
    private int id;
    private String name;
    
    public Person3(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String toString() {
        return "{ID is: " + id +"; Name is: " + name + "}";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person3 other = (Person3) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        
        Person3 p1 = new Person3(0, "Bob");
        Person3 p2 = new Person3(1, "Sue");
        Person3 p3 = new Person3(2, "Mike");
        Person3 p4 = new Person3(1, "Sue");

        
        Map<Person3, Integer> map = new LinkedHashMap<Person3, Integer>();
        
        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 1);
        
        for(Person3 key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        
        Set<Person3> set = new LinkedHashSet<Person3>();
        
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        
        System.out.println(set);
    }   
}