package javaclassesobjectsmethods;

// PASSING BY VALUE

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        JavaClassesObjectsMethods app = new JavaClassesObjectsMethods();
 
// ***************************************************

        int value = 7;
        System.out.println("1. Value is " + value);

        app.show(value);
        System.out.println("4. Value is " + value);
//        value in this scope is still 7

// ***************************************************
        
        System.out.println();
        
        Person person = new Person("Bob");
        System.out.println("1. Person is: " + person);
        
        app.show(person);
        
        System.out.println("4. Person is: " + person);

        
    }
    
    public void show(int value) {
        System.out.println("2. Value is " + value);
        
        value = 8;
//        changing variable value only in this scope
        
        System.out.println("3. Value is " + value);

    }
    
    public void show(Person person) {
        System.out.println("2. Person is: " + person);
        
        person.setName("Sue");
        
        person = new Person("Mike");
        
        System.out.println("3. Person is: " + person);

    }
    
//    method overloading: methods can have same name as long as
//      they have different argument types
}

// OUTPUT:

//1. Value is 7
//2. Value is 7
//3. Value is 8
//4. Value is 7
//
//1. Person is: Person [name=Bob]
//2. Person is: Person [name=Bob]
//3. Person is: Person [name=Mike]
//4. Person is: Person [name=Sue]
