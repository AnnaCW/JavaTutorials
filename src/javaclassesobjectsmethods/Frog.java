package javaclassesobjectsmethods;

 class Frog {
    private String name;
    private int age;
        // private => can access inside class but not outside
        // prevents frog1.name = "x", etc. 
        // must use setters
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
//        only need "this" when there is ambiguity in same scope
// as here, with instance variable and local/param
    }
    
    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}
