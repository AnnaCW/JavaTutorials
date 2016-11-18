package javaclassesobjectsmethods;

// INNER CLASSES

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        
       Robot1 robot = new Robot1(7);
       robot.start();
       
       Robot1.Battery battery = new Robot1.Battery();
       battery.charge();
    }
}



