
package javaclassesobjectsmethods;

public abstract class Vehicle {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public abstract void start();
//    every child class will have this - its own implementation
//    vehicle doesnt 
    
   
    public void run() {
        start();
       
    }
    
//    can call abstract methods in vehicle
//    just make the pieces you want child class to define abstract
    
}
