package javaclassesobjectsmethods;

//CONSTRUCTORS 

 class Machine {
     private String name;
     private int code;
    
//  constructors
     
    public Machine(){
         
        this("Arnie", 0);
//          **calls the third constructor**

        System.out.println("Constructor running! Name: " + name + " Code: " + code);
    }
    
    public Machine(String name) {
        System.out.println("Second constructor running! Name: " + name + " Code: " + code);
        this.name = name;
    }
    
    public Machine(String name, int code) {
        System.out.println("Third constructor running! Name: " + name + " Code: " + code);
        this.name = name;
        this.code = code;
    }
}
