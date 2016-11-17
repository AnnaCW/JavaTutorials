package javaclassesobjectsmethods;

import java.util.Objects;

// THE EQUALS METHOD

class Person1 {
    private int id;
    private String name;

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.name);
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
        final Person1 other = (Person1) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    // autogenerate by right clicking "Insert Code..."
//    override equals to tell us what we want to know

    
}

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        
        Person1 p1 = new Person1(5, "Bob");
        Person1 p2 = new Person1(5, "Bob");
        
        System.out.println(p1 == p2); 
//        returns boolean that tells us whether these are pointing to the same object
//        false
        
        System.out.println(p1.equals(p2));
//        uses .equals override
//        true

        Integer num1 = 6;
        Integer num2 = 6;
//      
        System.out.println(num1 == num2);
//        but this does work - returns true
//       with integers NOT double

        String text1 = "Hello";
        String text2 = "Hello";
                
        System.out.println(text1 == text2);
//        true
//        this does work
//        Java sets to same object
    }
}



