package javaclassesobjectsmethods;

// ENUMS

public class JavaClassesObjectsMethods {
        
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        
        switch(animal) {
        case DOG:
            System.out.println("Dog");
            break;
        case CAT:
            System.out.println("Cat");
            break;
        case MOUSE:
            System.out.println("Mouse");
            break;
        default: 
            break;
        }
        
        System.out.println(Animal.CAT.getClass());
        
        System.out.println(Animal.CAT instanceof Animal);
//        true

        System.out.println(Animal.CAT instanceof Enum);
//        true

        System.out.println(Animal.MOUSE.getName());
        
        System.out.println(Animal.DOG);
//        uses the toString override method
        
        System.out.println("Enum name as a string: " + Animal.DOG.name());
//        this is a built-in name method for enums
//        DOG 

        Animal animal2 = Animal.valueOf("CAT");
        
        System.out.println(animal2);
    }
}



