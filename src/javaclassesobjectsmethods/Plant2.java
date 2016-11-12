package javaclassesobjectsmethods;


public class Plant2 {
    
    public static final int ID = 7; 
    private String name;
    
    public String getData() {
        String data = "stuff" + calculateGrowth();
        
        return data;
    }
    
    private int calculateGrowth() {
        return 9;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
