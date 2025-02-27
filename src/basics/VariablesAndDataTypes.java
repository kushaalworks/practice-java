package basics;
// Java program to demonstrate variables and data types
public class VariablesAndDataTypes {
    public static void main(String[] args) {
        
        // Integer data type (whole numbers)
        int age = 25;
        System.out.println("Age: " + age);

        // Floating point number (decimal values)
        double price = 99.99;
        System.out.println("Price: " + price);

        // Character data type (stores single character)
        char grade = 'A';
        System.out.println("Grade: " + grade);

        // Boolean data type (true or false)
        boolean isJavaFun = true;
        System.out.println("Is Java fun? " + isJavaFun);

        // String (a sequence of characters)
        String name = "John Doe";
        System.out.println("Name: " + name);

        // Byte (small integer values, range: -128 to 127)
        byte smallNumber = 100;
        System.out.println("Small Number (byte): " + smallNumber);

        // Short (larger than byte, range: -32,768 to 32,767)
        short shortNumber = 32000;
        System.out.println("Short Number: " + shortNumber);

        // Long (very large integer, suffix 'L' is used)
        long bigNumber = 9876543210L;
        System.out.println("Big Number (long): " + bigNumber);

        // Float (decimal values, suffix 'F' is used)
        float pi = 3.14F;
        System.out.println("Pi value (float): " + pi);
        
        // Constant variable (final keyword prevents modification)
        final double GRAVITY = 9.8;
        System.out.println("Gravity: " + GRAVITY);

    }
}
