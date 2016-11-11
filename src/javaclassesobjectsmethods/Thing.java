
package javaclassesobjectsmethods;


 class Thing {
    public String name;
    public static String description;
//    static = class variable, not instance variable
    public final static int LUCKY_NUMBER = 7;
//    constant / final cannot be reassigned
    
    public static int count = 0;
    
    public int id;
            
    
    public Thing() {
        id = count;
        count++;
    }
    //     constructor. runs everytime an instance is created
    
    
    //            ALL OF THE ABOVE SHOULD NORMALLY BE PRIVATE
//            AND BE ACCESSED BY GETTERS
    
    public void showName() {
        System.out.println("Object id: " + id + ", " + description + ": " + name);
//        instance methods can access static data
//       static / class variable exists by the time the instance is created
    }
    
    public static void showInfo() {
        System.out.println(description);
//        System.out.println(name); wont work because name is an instance variable
    }
}

