
package javaclassesobjectsmethods;

public enum Animal {
    CAT("Ferg"), DOG("Fido"), MOUSE("Squeak");
        //these are objects of the type animal
    
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + '}';
    }
    
    
}
