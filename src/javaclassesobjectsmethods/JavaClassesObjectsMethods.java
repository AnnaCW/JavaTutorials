package javaclassesobjectsmethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

// NATURAL ORDER

class Person5 implements Comparable<Person5> {
    private String name;
    
    public Person5(String name) {
        this.name = name;
    }
    
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person5 person) {
        int len1 = name.length();
        int len2 = person.name.length();
        
        if(len1 > len2) {
            return 1;
        }
        else if(len1 < len2) {
            return -1;
        }
        return name.compareTo(person.name);
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Person5 other = (Person5) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }       
}

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
       List<Person5> list = new ArrayList<>();
       SortedSet<Person5> set = new TreeSet<>();
       
       addElements(list);
       addElements(set);
       
       Collections.sort(list);
       
       showElements(list);
       System.out.println();
       showElements(set);
    }   
    
    private static void addElements(Collection<Person5> col) {
        col.add(new Person5 ("Joe"));
        col.add(new Person5 ("Sue"));
        col.add(new Person5 ("Julie"));
        col.add(new Person5 ("Mike"));
        col.add(new Person5 ("Clare"));
    }
    
    private static void showElements(Collection<Person5> col) {
        for(Person5 element: col) {
            System.out.println(element);
        }
    }
}