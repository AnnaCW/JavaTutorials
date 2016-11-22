package javaclassesobjectsmethods;

import java.io.Serializable;

public class Person implements Serializable {
    
    private transient int id;
//        transient prevents from being serialized
//        Id will be zero (default value for int)
    private String name;
    
    private static int count; 
    
    public Person() {
        System.out.println("default constructor");
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }
    
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        
        System.out.println("Two-argument constructor");
    }
    
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "] Count is: " + count;
    }
}
