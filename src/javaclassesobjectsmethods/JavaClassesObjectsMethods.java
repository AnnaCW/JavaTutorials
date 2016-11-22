package javaclassesobjectsmethods;

// ARRAY LIST

import java.util.ArrayList;

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        
//      ADDING ITEMS       
        nums.add(10);
        nums.add(100);
        nums.add(50);
        
//      RETRIEVING
        System.out.println(nums.get(0));
        
        
//      INDEXED FOR LOOP ITERATION 
        System.out.println("\nIteration #1: ");

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        
//      ANOTHER METHOD OF ITERATION   
        System.out.println("\nIteration #2: ");
        
        for (Integer value: nums) {
            System.out.println(value);
        }
        
//     REMOVING ITEMS (BE CAREFUL) 
        nums.remove(nums.size() - 1);

        nums.remove(0);
//        this is very slow - copies all remaining items to move them up
//        use linked list instead
        
        System.out.println("\nAfter removing first and last: ");

        for (Integer value: nums) {
            System.out.println(value);
        }
    }
}
