package com.Catalin;

public class Main {

    public static void main(String[] args) {
        /**Primitive data types built into Java:
        byte
        short
        int
        long
        float
        double
        char
        boolean
         */
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        /**String can be considered the 9th data type but it is not actually a primitive data type,
         * it is a class even if it has a reserved keyword in Java.
         * String can contain a sequence of characters unlike char that can only contain 1.
         */
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2018";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);
        /**Because String is a textual data type, not a numerical one that supports calculations, the
         * print will be 250.55.49.95. It treats everything inserted between the double commas as being
         * text so it adds the value of variable numberString next to 49.95 (concatenation).
         */
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        /** The output will be 1050, because Strings do not support calculations, 10 was a string and 50
         * a number. 50, the integer, was converted to text and appended to the lastString, resulting
         * in 1050, not 60.
         */
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);
    }
}
