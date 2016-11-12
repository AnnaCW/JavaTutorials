
package javaclassesobjectsmethods;

// a class can only EXTEND one parent class
//but in can implement multiple classes
//use comma separated list

public class Engine implements Info {
    
    private int id = 7;
    
    public void start() {
        System.out.println("Engine Started");
    }
    
    @Override
    public void showInfo() {
        System.out.println("Engine id is: " + id);
    }
    
//    to use "implements info" need to have all methods
//    in info interface defined in this class
//    can override
     
}
