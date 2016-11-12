package javaclassesobjectsmethods;


public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
       
        Engine e1 = new Engine();
        e1.start();
        
        Human h1 = new Human("Bob");
        h1.greet();
        
        Info info1 = new Engine();
        info1.showInfo();
//        can do this because engine implements info
//        can only use to access the one Info method 

        Info info2 = h1;
        info2.showInfo();
        
        outputInfo(e1);
        outputInfo(h1);
    }
    
    private static void outputInfo(Info info) {
        info.showInfo();
    }
}