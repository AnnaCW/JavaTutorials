
package javaclassesobjectsmethods;

public class Car extends Widget {
        
    @Override
    public void start() {
        System.out.println("Car started");
    }
//    this method overrides the start method in the parent class
    
    public void wipeWindShield() {
        System.out.println("wiping ws");
    }
    
    public void showInfo() {
        System.out.println(name);
    }
}

//car extends widget: 
    //car extends widget: car is a child of machine
    //machine is the parent
    //car is derived from widget
    //car inherents from widget
    //car is a widget
