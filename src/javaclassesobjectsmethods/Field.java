
package javaclassesobjectsmethods;

public class Field {
    private Plant plant = new Plant();
    
    public Field() {
        System.out.println(plant.size);
//        works - size is protected and field is in the same package as plant
    }
}
