package javaclassesobjectsmethods;

//CASTING NUMERICAL VALUES

public class JavaClassesObjectsMethods {
    
    public static void main(String[] args) {
        
        byte byteValue = 20;
        short shortValue = 55; 
        
        int intValue = 888;
        System.out.println("intValue: " + intValue);
        
        long longValue = 23333;
        System.out.println("longValue: " + longValue);
        
        float floatValue = 8334.8f;
        System.out.println("floatValue: " + floatValue);

        double doubleValue = 32.4;
        System.out.println("doubleValue: " + doubleValue);

               
        intValue = (int)longValue;
//            type I'm casting to (int), then value I'm casting to
        System.out.println("long to int: " + intValue);
        
        doubleValue = intValue;
//        no casting needed because no potential problem here
        System.out.println("int to double: " + doubleValue);
        
        intValue = (int)floatValue;
        System.out.println("float to int: " + intValue);
        
        System.out.println("byte max: " + Byte.MAX_VALUE);

        byteValue = (byte)128;
        System.out.println("128 to byte: " + byteValue);
//        unexpected behavior - 128 is too big 
    }
      
}