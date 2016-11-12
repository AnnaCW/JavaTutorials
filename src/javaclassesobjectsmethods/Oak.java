package javaclassesobjectsmethods;

public class Oak extends Plant {
    
    public Oak() {
//      type = "tree";
//        cant do because type is private

        size = "large";
//        works because size is protected and oak is a subclass of plant

        height = 10;
//        works - same package
    }
}
