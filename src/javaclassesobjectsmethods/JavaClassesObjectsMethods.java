package javaclassesobjectsmethods;

// RECURSION

public class JavaClassesObjectsMethods {
        
    public static void main(String[] args) {
        
//      e.g 4! = 4 * 3 * 2 * 1 (factorial 4)

        System.out.println(factorial(4));
    }
    
    private static int factorial(int value) {
        
        if(value == 1) {
            return 1;
        }
        
        return factorial(value - 1) * value;

    }
}



