package javaclassesobjectsmethods;

//UPCASTING AND DOWNCASTING

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        
        Machine2 machine2 = new Machine2();
        Camera camera1 = new Camera();
        
        machine2.start();
        camera1.start();
        camera1.snap();
     
//      UPCASTING - camera taken and made type machine
//          variable originally of type camera
//          now refered to by a variable of a type up the hierarchy
//          hence upcasting
        Machine2 machine3 = camera1;
        machine3.start();
//        machine3 is a camera - bc the object referred to by machine2 is a camera

//      machine3.snap(): this wont work - its the variable that determines
//                which methods are available
//              but the type of object to which the variable refers that determines which
//        IMPLEMENTATION of the methods

//DOWNCASTING
        
        Machine2 machine4 = new Camera();
        Camera camera2 = (Camera)machine4;
//        when downcasting, java requires confirmation - the parenthetical
           //casting variable of type machine to type camera
        camera2.snap();
        
//        Machine2 machine5 = new Machine2();
//        Camera camera3 = (Camera)machine5;
//        camera3.start();
    }
      
}