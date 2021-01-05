package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value: " + myMinFloatValue);
        System.out.println("Float Maximum Value: " + myMaxFloatValue);

        System.out.println("---------------------------------");

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value: " + myMinDoubleValue);
        System.out.println("Double Maximum Value: " + myMaxDoubleValue);

        System.out.println("---------------------------------");

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5.00 / 2.00;

        System.out.println("MyIntValue: " + myIntValue);
        System.out.println("MyFloatValue: " + myFloatValue);
        System.out.println("MyDoubleValue: " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms: " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_5674_890d;
        System.out.println("Pi: " + pi);
        System.out.println("AnotherNumber: " + anotherNumber);


    }
}
