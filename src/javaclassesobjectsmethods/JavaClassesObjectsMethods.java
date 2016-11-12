package javaclassesobjectsmethods;

import java.util.ArrayList;

class Dog {
    @Override
    public String toString() {
        return "I am a dog";
    }
}

class Collie extends Dog {
    @Override
    public String toString() {
        return "I am a collie";
    }
}

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        ArrayList<Dog> list1 = new ArrayList<>();
        
        list1.add(new Dog());
        list1.add(new Dog());
        showList(list1);
        
        ArrayList<Collie> list2 = new ArrayList<>();
        
        list2.add(new Collie());
        list2.add(new Collie());
        showList(list2);
    }
    
    // WILD CARD WITH UPPER BOUND
    //java just knows its dealing with some kind of dog
    
     public static void showList(ArrayList<? extends Dog> list) {
         for (Dog value: list) {
             System.out.println(value);
             //can call Dog methods here but not Collie methods
         }
    
//         *************** WILD CARD WITH LOWER BOUND *******
         
//      less useful 
//      objects here dont necessarily have Collie methods
//      takes Collie or super class of Collie
    
//    public static void showList(ArrayList<? super Collie> list) {
//        for (Object value: list) {
//            System.out.println(value);
//        }
//    }
            
           
//         ****************WILD CARD *****
         
//    public static void showList(ArrayList<?> list) {
//         for(Object value: list) {
//            System.out.println(value);
//        }
//        the question mark allows us to pass any type of array list
//        array list consisting of any object types
//        downside: no dog specific methods or collie-specific methods
       
    }
      
}