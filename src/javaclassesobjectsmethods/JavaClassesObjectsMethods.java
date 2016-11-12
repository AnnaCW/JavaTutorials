package javaclassesobjectsmethods;

//POLYMORPHISM

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
       Tree tree = new Tree();
       Maple maple = new Maple();
       
//     Tree tree2 = tree; two references to same object
         
       Tree tree2 = maple;
//       polymorphism - can use child (maple) whereever you would use parent(tree)
       
       tree2.grow();
//       the object tree2 is pointing to is maple

       maple.shedLeaves();
       
//     tree2.shedLeaves(); won't work - variable tree2 is a type of tree

       doGrow(maple);
    }
    
    public static void doGrow(Tree tree) {
        tree.grow();
    }
    
}