package learn01;

public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        byte byteVar = 127;                 // 8-bit signed integer
        short shortVar = 32000;             // 16-bit signed integer
        int intVar = 2000000;               // 32-bit signed integer
        long longVar = 123456789012345L;    // 64-bit signed integer

        float floatVar = 3.14f;             // 32-bit floating point
        double doubleVar = 3.141592653589793238;  // 64-bit floating point

        char charVar = 'A';                 // 16-bit Unicode character

        boolean boolVar = true;             // true or false

        // Non-Primitive Data Types
        String stringVar = "Hello, World!"; // String class

        // Array
        int[] intArray = {1, 2, 3, 4, 5};   // Array of integers

        // Output
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("boolVar: " + boolVar);
        System.out.println("stringVar: " + stringVar);
        System.out.print("intArray: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
    }
}
