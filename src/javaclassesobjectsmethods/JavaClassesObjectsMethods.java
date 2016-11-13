package javaclassesobjectsmethods;

//ABSTRACT CLASSES

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        Motorcycle moto1 = new Motorcycle();
        moto1.setId(5);
        moto1.start();
        
        Truck truck1 = new Truck();
        truck1.setId(2);
        truck1.start();
        
//        Vehicle vehicle = new Vehicle();
//        can decide that there is no use for a vehicle
//        prevent instantiation by making it abstract
    }
    
}
