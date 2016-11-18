package javaclassesobjectsmethods;

public class Robot1 {
    
    private int id;
    
    private class Brain {
        public void think() {
            System.out.println("Robot " + id + " is thinking");
        }
    }
    
    public static class Battery {
        public void charge() {
            System.out.println("Battery charging");
        }
    }
   // can't refer to id here because this is a static class
   // usu static inner methods are used to group classes
   // when class isn't associated with instances of the outer class
   // but want it grouped with the outer class
   // otherwise like normal classes

    public Robot1(int id) {
        this.id = id;
    }
    
    public void start() {
        System.out.println("Starting Robot " + id);
        
        Brain brain = new Brain();
        brain.think();
        
        final String name = "Robert";
        
        class Temp {
            public void doSomething() {
                System.out.println("ID is: " + id);
                System.out.println("My name is " + name);
            }
        }
        
        Temp temp = new Temp();
        temp.doSomething();
    }
       
}

//one public top-level class per file, that matches the file name
//but can have classes within
//if not static, these can access instance data of the outer class
