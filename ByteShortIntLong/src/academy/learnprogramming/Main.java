package academy.learnprogramming;
/*
        PRIMITIVE TYPES
        boolean, byte, char, short, int, long, float are primitive types
         */

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;
	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);
        System.out.println("Busted MAX Value: " + (myMaxIntValue + 1)); //overflow
        System.out.println("Busted MIN Value: " + (myMinIntValue - 1)); //underflow

        // int myMaxIntText = 2147483648; -> integer number too large
        int myMaxIntTest = 2_147_483_647; // you can write like this for reading easily

        System.out.println("--------------------------------");

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Maximum Value: " + myMaxByteValue);

        System.out.println("--------------------------------");

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Maximum Value: " + myMaxShortValue);
        short bigShortLiteralValue = 32767;

        System.out.println("--------------------------------");

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Maximum Value: " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println("bigLongLiteralValue: " + bigLongLiteralValue);

        System.out.println("--------------------------------");
        System.out.println("Byte -> 8 bits");
        System.out.println("Short -> 16 bits");
        System.out.println("Int -> 32 bits");
        System.out.println("Long -> 64 bits");
        System.out.println("--------------------------------");
        /*
        Casting means to treat or convert a number from one type to another.
        We put the type we want the number to be in parenthesis like this:
        (byte) (myMinByteValue/2);
         */

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue/2);




    }
}
