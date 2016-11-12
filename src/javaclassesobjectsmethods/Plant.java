
package javaclassesobjectsmethods;

public class Plant {
    
    public String name;   
//    bad practice to have public instance variable
    
    public final static String Description = "I am a plant.";
//    constant - acceptable because it's final
    
    private String type;
//    access in this class only 
    
    protected String size;
//    protected - can also use in child class
    
    int height;
//    default is package level visibility 
    
    public Plant() {
        name = "Plantly";
        
        type = "plant";
        
        size = "medium";
    }
    
}
