package info.dharmesh.LearningJAVA.LearningJAVA;

public class Operators {


    public static void LearningArithmetic() {
        // ADD +
        float var1 = 1.0F;
        float var2 = 2.0F;
        float var3 = var1 + var2;
        System.out.println("Float " + var1 + " + Float " + var2 + " = Float " + var3);

        int var4 = 1;
        int var5 = 2;
        int var6 = var4 + var5;
        System.out.println("int " + var4 + " + int " + var5 + " = int " + var6);

        // SUBTRACT  -
        float var7 = 5.0F;
        float var8 = 4.0F;
        float var9 = var7 - var8;
        System.out.println("Float " + var7 + " - Float " + var8 + " = Float " + var9);

        int var10 = 5;
        int var11 = 4;
        int var12 = var10 - var11;
        System.out.println("int " + var10 + " - int " + var11 + " = int " + var12);

        // MULTIPLY *
        float var13 = 4.0F;
        float var14 = 2.0F;
        float var15 = var13 * var14;
        System.out.println("Float " + var13 + " * Float " + var14 + " = Float " + var15);

        int var16 = 4;
        int var17 = 2;
        int var18 = var16 * var17;
        System.out.println("int " + var16 + " * int " + var17 + " = int " + var18);

        // DIVIDE /
        float var19 = 13.0F;
        float var20 = 5.0F;
        float var21 = var19 / var20;
        System.out.println("Float " + var19 + " / Float " + var20 + " = Float " + var21);

        int var22 = 13;
        int var23 = 5;
        int var24 = var22 / var23;
        System.out.println("int " + var22 + " / int " + var23 + " = int " + var24);

        // MODULUS %
        float var25 = 13.0F;
        float var26 = 5.0F;
        float var27 = var25 % var26;
        System.out.println("Float " + var25 + " % Float " + var26 + " = Float " + var27);

        int var28 = 13;
        int var29 = 5;
        int var30 = var28 % var29;
        System.out.println("int " + var28 + " % int " + var29 + " = int " + var30);


    }

    public static void PreAndPostFixOperator() {
        // Prefix Operator
        int someValue = 5;
        System.out.println("Let X = " + someValue);
        System.out.println("prefix ++ for X (++X) = ");
        System.out.println(++someValue);
        System.out.println("new Value for X = " + someValue);

        // Postfix Operator
        int someOtherValue = 5;
        System.out.println("Let y = " + someOtherValue);
        System.out.println("ppstfix ++ for X (X++) = ");
        System.out.println(someOtherValue++);
        System.out.println("new Value for X = " + someOtherValue);

    }

    public static void CompoundAssignment() {

        int myValue = 50;
        System.out.println("Let's assume X = " + myValue);
        myValue -= 5;
        System.out.println("using '-='  operator with value 5, new value of X is " + myValue);

        int myOtherValue = 100;
        System.out.println("Let's assume Y = " + myOtherValue);
        int var1 = 5;
        int var2 = 10;
        System.out.println("Taking 2 vars as 5 & 10");
        myOtherValue /= var1 * var2;
        System.out.println("using '/=' operator with (var1 * var2), new value of Y is " + myOtherValue);

    }

    public static void OperatorPrecedence() {
        /*
        Operator Precedence
        Postfix  >>   Prefix  >>  Multiplication  >>  Additive
        X++ X--  >>  ++X --X  >>     * / %        >>    + -

        * Operator of equal precedence evaluated left-to-right
        * () can override precedence with parenthesis
        * Nested parenthesis evaluated from inside out

        */

        int var1 = 21;
        int var2 = 6;
        int var3 = 3;
        int var4 = 1;

        int result1 = var1 - var2 / var3;
        System.out.println("Let's assume A = 21, B = 6, C = 3 and D = 1");
        System.out.println("A - B / C = " + result1);
        int result2 = (var1 - var2) / var3;
        System.out.println("(A - B) / C = " + result2);
        int result3 = var1 / var3 * var4 + var2;
        System.out.println("A / C * D + B = " + result3);
        int result4 = var1 / (var3 * (var4 + var2));
        System.out.println("A / (C * (D + B)) = " + result4);


    }
}
