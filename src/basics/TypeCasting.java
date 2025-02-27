package basics;

public class TypeCasting {
    public static void main(String[] args) {
    	
    	implicitCasting();
    	
    	System.out.println("====================");
    	
    	explicitCasting();
    }
    
    static void implicitCasting()
    {
        byte smallByte = 10;
        short smallShort = smallByte; // byte → short
        int smallInt = smallShort;    // short → int
        long smallLong = smallInt;    // int → long
        float smallFloat = smallLong; // long → float
        double smallDouble = smallFloat; // float → double

        System.out.println("Byte Value: " + smallByte);
        System.out.println("Short Value: " + smallShort);
        System.out.println("Int Value: " + smallInt);
        System.out.println("Long Value: " + smallLong);
        System.out.println("Float Value: " + smallFloat);
        System.out.println("Double Value: " + smallDouble);

    }
    
    static void explicitCasting()
    {
    	 double largeDouble = 99.99;
         float largeFloat = (float) largeDouble; // double → float
         long largeLong = (long) largeFloat;     // float → long
         int largeInt = (int) largeLong;         // long → int
         short largeShort = (short) largeInt;    // int → short
         byte largeByte = (byte) largeShort;     // short → byte

         System.out.println("Double Value: " + largeDouble);
         System.out.println("Float Value: " + largeFloat);
         System.out.println("Long Value: " + largeLong);
         System.out.println("Int Value: " + largeInt);
         System.out.println("Short Value: " + largeShort);
         System.out.println("Byte Value: " + largeByte);
    }
}
