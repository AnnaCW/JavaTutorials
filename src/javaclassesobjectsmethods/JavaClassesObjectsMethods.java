package javaclassesobjectsmethods;

// LINKED LISTS

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        
        LinkedList<Integer> ll = new LinkedList<>();
        
        doTimings("ArrayList", al);
        doTimings("LinkedList", ll);
    }
    

    private static void doTimings(String type, List<Integer> list) {
   //  this list interface can be any kind of list
       
       for(int i=0; i<1E5; i++) {
           list.add(i);
       }
       
       long start = System.currentTimeMillis();

// add to end
       for(int i=0; i<1E5; i++) {
         list.add(i);
       }      
       
// add to beginning
//      for(int i=0; i<1E5; i++) {
//         list.add(0, i);
//       }
       
       long end = System.currentTimeMillis();

       System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }
}

// ArrayList is faster adding to / removing from end
// also faster retrieving an item from a particular index number

// LinkedList is faster for manipulating beginning or middle of list

//   Use ArrayList UNLESS you want to 
//   add to / remove from from the beginning or middle of the list


//Output adding to end: 
//Time taken: 10 ms for ArrayList
//Time taken: 17 ms for LinkedList

//Output adding to beginning: 
//Time taken: 6568 ms for ArrayList
//Time taken: 11 ms for LinkedList