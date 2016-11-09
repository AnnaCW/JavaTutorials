package javaclassesobjectsmethods;

class Person {
    String name;
    int age;
    
    void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
    
    void sayHello() {
        System.out.println("Hello");
    }
    
    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
        
        return yearsLeft;
    }
}
