package javaclassesobjectsmethods;

public class JavaClassesObjectsMethods {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe";
        person1.age = 20;
        person1.sayHello();
        person1.speak();

        Person person2 = new Person();
        person2.name = "Jane";
        person2.age  = 60;
        person2.speak();
        
        int years = person2.calculateYearsToRetirement();
        
        System.out.println("Years until retirement: " + years + ".");
        
        int age = person1.getAge();
        String name = person1.getName();
        
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        
    }    
}
