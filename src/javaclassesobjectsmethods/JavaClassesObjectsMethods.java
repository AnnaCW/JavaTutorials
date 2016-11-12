package javaclassesobjectsmethods;


public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
       Plant plant = new Plant();
       
       System.out.println("My name is " + plant.name + ". " + Plant.Description);
       
       System.out.println(plant.size);
       
       Oak oak = new Oak();
       
       System.out.println(oak.size);
       System.out.println(oak.height);

    }
    
}