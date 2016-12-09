package javaclassesobjectsmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// SORTING LISTS

class Person4 {
    private int id;
    private String name;
    
    public Person4(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
    
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        
        int len1 = o1.length();
        int len2 = o2.length();
        
        if (len1 > len2) {
            return 1;
        }
        
        else if(len1 < len2) {
            return -1;
        }
        
        return 0;
    }
}

class ReverseAlphabeticalComparator implements Comparator<String> {
   public int compare(String o1, String o2) {
       return -o1.compareTo(o2);
   }
}

public class JavaClassesObjectsMethods {
    
    
    public static void main(String[] args) {
       
///////////// Sorting Strings ///////////////////////
       List<String> animals = new ArrayList<>();
       
       animals.add("cat");
       animals.add("lion");
       animals.add("dog");
       animals.add("snake");
       animals.add("rat");
       animals.add("bat");

//       Collections.sort(animals, new StringLengthComparator());
       Collections.sort(animals, new ReverseAlphabeticalComparator());

       
       for(String animal: animals) {
           System.out.println(animal);
       }
 ///////////// Sorting Numbers ///////////////////////
      
       List<Integer> numbers = new ArrayList<>();
       
       numbers.add(3);
       numbers.add(1);
       numbers.add(36);
       numbers.add(16);
       numbers.add(12);
       
//       Collections.sort(numbers);
       
       Collections.sort(numbers, new Comparator<Integer>() {
           @Override
           public int compare(Integer num1, Integer num2) {
               return -num1.compareTo(num2);
           }
       });
       
        for(Integer number: numbers) {
           System.out.println(number);
       }
        
  ///////////// Sorting Arbitrary Objects ///////////////////////
      
       List<Person4> people = new ArrayList<Person4>();
       
       people.add(new Person4(1, "Jane"));
       people.add(new Person4(4, "Bob"));
       people.add(new Person4(3, "Anna"));
       people.add(new Person4(2, "Greg"));
       
//       Collections.sort(people); doesnt work b/c no natural order

// sort by ID 
        Collections.sort(people, new Comparator<Person4>() {
            public int compare (Person4 p1, Person4 p2) {
                
                if(p1.getId() > p2.getId()) {
                    return 1;
                }
                else if(p1.getId() < p2.getId()) {
                    return -1;
                }
                
                return 0;
            }
        });
        
        for(Person4 person: people) {
           System.out.println(person);
        }
        
// sort by name

        Collections.sort(people, new Comparator<Person4>() {
            public int compare (Person4 p1, Person4 p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
       
       for(Person4 person: people) {
           System.out.println(person);
       }

    }   
}