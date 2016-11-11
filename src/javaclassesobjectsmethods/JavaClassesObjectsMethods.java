package javaclassesobjectsmethods;

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
       Thing.description = "I am a thing";
       
       Thing.showInfo();
       
       System.out.println("Before creating objects, count is: " + Thing.count);
       
       Thing thing1 = new Thing();
       Thing thing2 = new Thing();
       
       thing1.name = "Bob";
       thing2.name = "Sue";
       
       thing1.showName();
       thing2.showName();
       
       System.out.println(Thing.LUCKY_NUMBER);
       
       System.out.println("After creating objects, count is: " + Thing.count);

    }
}