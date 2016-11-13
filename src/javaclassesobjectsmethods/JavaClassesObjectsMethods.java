package javaclassesobjectsmethods;

//Anonymous classes 

class Auto {
    public void start() {
        System.out.println("Auto starting...");
    }
}

interface Shrub {
    public void grow();
}

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        
        Auto auto1 = new Auto() {    
          @Override public void start() {
            System.out.println("Auto sputtering");
           }
        };
                
        auto1.start();
        
        Shrub shrub1 = new Shrub() {
            @Override
            public void grow() {
                System.out.println("Shrub growing");
            }
            
        };
        
        shrub1.grow();
    }
}

/// instance auto1 belongs to a nameless child class of auto
//good for when you want one thing that's just a little different than parent
//no easy way to create another one

//shrub1 is an anon class that implements the Shrub interface
//alternative to making a new named class that implements Shrub