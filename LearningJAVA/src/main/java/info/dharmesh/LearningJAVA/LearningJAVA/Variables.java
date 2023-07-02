package info.dharmesh.LearningJAVA.LearningJAVA;

public class Variables {

    public static void LearningVariable() {

        //Learning Variables
        final int myVar;
        myVar = 50;
        System.out.println("myVar = " + myVar);
        int anotherVar = 100;
        System.out.println("anotherVar = " + anotherVar);
        //myVar = anotherVar;
        //System.out.println(myVar);


        //Primitive Data Types - Four main Categories
        //Integer
        byte var1 = 8; //Bits = 8, Min Value = -128, Max Value = 127, Literal Form = 0
        short var2 = 16; //Bits = 16, Min Value = -32768, Max Value = 32767 Literal, Form = 0
        int var3 = 32; //Bits = 32, Min Value = -2147483648, Max Value = 2147486947, Literal Form = 0
        long var4 = 64L; //Bits = 64, Min Value = -9223372036854775808, Max Value = 9223372036854775807, Literal Form = 0L

        //Floating Point
        float var5 = 32f; // Bits = 32, Smallest Positive Value = 1.4 x 10^-45, Largest Positive Value = 3.4 x 10^38, Literal Form = 0.0f
        double var6 = 64d; // Bits = 64, Smallest Positive Value = 4.9 x 10^-324, Largest Positive Value = 1.7 x 10^308, Literal Form = 0.0d

        //Character
        char var7 = 'U';
        char var8 = '\u00DA'; // for Ú

        //Boolean
        boolean var9 = true;

        System.out.println("byte = " + var1);
        System.out.println("short = " + var2);
        System.out.println("int = " + var3);
        System.out.println("long = " + var4);
        System.out.println("float = " + var5);
        System.out.println("double = " + var6);
        System.out.println("char = " + var7);
        System.out.println("char = " + var8);
        System.out.println("boolean = " + var9);


    }

    public static void TypeConversion() {
        System.out.println("// Implicit conversion");
        System.out.println("// Widening Conversion are performed automatically");
        System.out.println("// 1) Mixed Integer Sizes = used largest integer in equation");
        System.out.println("// 2) Mixed floating point sizes = used double");
        System.out.println("// 3) Mixed integer and floating point = Used largest floating point in equation");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("// Explicit Type Conversion ");
        System.out.println("// Can perform widening or narrowing conversion. be aware of potential side effects");
        System.out.println("// 1) Narrowing Conversion -  Significant bits may be discarded");
        System.out.println("// 2) Floating Point to integer - Fractional portion is discarded");
        System.out.println("// 3) Integer to floating point - Precision may be lost");

        float floatval = 1.0f;
        double doubleval = 4.0d;
        byte byteval = 7;
        short shortval = 7;
        long longval = 5;

        short result1 = (short) longval;
        System.out.println("longval need an explicit conversion to get assing in shortval. eg : (short) longval =  " + result1 + " (a short variable)");

        short result2 = (short) (byteval - longval);
        System.out.println("longval with operation on other byteval also need an explicit conversion to get assing in shortval. eg : (short) (byteval - longval) = " + result2 + " (a short variable) ");

        float result3 = longval - floatval;
        System.out.println("longval with operation on other floatval needs no explicit conversion to get assing in floatval. eg : longval - floatval = " + result3 + " (a float variable)");


    }

}
