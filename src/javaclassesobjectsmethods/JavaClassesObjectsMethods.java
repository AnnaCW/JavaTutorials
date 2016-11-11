package javaclassesobjectsmethods;

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        
       StringBuilder sb = new StringBuilder();
       
       sb.append("My name is Bob");
       sb.append(" ").append("I am a lion tamer");
       
       System.out.println(sb);
      
        // more efficient than just creating a string
        //string is immutable, so what appears to be changing string
        //is actually creating a new string and reassigning var

        //*** STRING FORMATTING ********

        System.out.println("This is some text.\tThat was a tab.\nThat was a new line.");
        
        for (int i = 0; i < 12; i++) {
            System.out.printf("%2d: some text here\n", i);

        }
        
        System.out.printf("Total value: %.2f\n", 5.6);
        
//*******************
       Thing.description = "I am a thing";
       
       Thing.showInfo();
       
       System.out.println("Before creating objects, count is: " + Thing.count);
       
       Thing thing1 = new Thing();
       Thing thing2 = new Thing();
       
       thing1.name = "Bob";
       thing2.name = "Sue";
       
       thing1.showName();
       thing2.showName();
       
       System.out.println(Thing.LUCKY_NUMBER);
       
       System.out.println("After creating objects, count is: " + Thing.count);

    }
}