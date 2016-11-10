package javaclassesobjectsmethods;

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        Frog frog1 = new Frog();
        
        frog1.setInfo("Lawrence", 1);
        
        System.out.println(frog1.getName());
        System.out.println(frog1.getAge());
    }

//    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.name = "Joe";
//        person1.age = 20;
//       
//        int age = person1.getAge();
//        String name = person1.getName();
//        
//        System.out.println("Name is: " + name);
//        System.out.println("Age is: " + age);
//        
//        Robot sam = new Robot();
//        
//        String greeting = "Hi I'm Sam";
//        sam.speak(greeting);
//        
//        int value = 14;
//        sam.jump(value);
//        sam.move("West", 12.2);
//        
//    }    
}
