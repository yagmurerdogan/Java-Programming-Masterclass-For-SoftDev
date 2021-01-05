public class Hello {
    /*
    What is method? Well it's a collection of statements one or more that perform an operation.
We'll be using here a special method called the main method that Java looks for when running a program.
It's the entry point for any Java code.
     */
    public static void main(String[] args) {
        /*
        public -> an access modifier
        static -> java keyword that needs an understanding of other concepts
        void -> java keyword used to indicate that method will not return anything
        {} -> code block
         */
        System.out.println("Hello, Yağmur"); //semicolon -> ;

        int myFirstNumber = (5 + 10) + (2 * 10); //camelCasing
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 3;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;
        System.out.println("myFirstNumber: " + myFirstNumber);
        System.out.println("myTotal: " + myTotal);
        System.out.println("myLastOne: " + myLastOne);

    }
}
