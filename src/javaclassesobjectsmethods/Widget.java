
package javaclassesobjectsmethods;

public class Widget {
    
//    private String name = "Widget Type 1";
//      private = can only be accessed from within widget
//      no access in car
    
    protected String name = "Widget Type 1";
//        protected: can access from anywhere within package
//          including a child class

    public void start() {
        System.out.println("Widget started");
    }
    
    public void stop() {
        System.out.println("Widget stopped");
    }
}
