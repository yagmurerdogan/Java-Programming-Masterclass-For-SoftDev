package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2; // + and = are operators, 1 and 2 are operands
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " +previousResult);
        result = result - 1;
        System.out.println("previousResult = " +previousResult);
        result = result *10;
        System.out.println("2 * 10 = " + result);
        result = result / 5;
        System.out.println("20 / 5 = " + result);
        result = result % 3;
        System.out.println("4 % 3 = " + result);

        //result = result + 1 -> result++
        //result = result -1 -> result--
        //result = result + 2 -> result+=2
        //result = result -3 -> result-=3
        //result = result * 10 -> result*=10

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens.");
        }

        int topScore = 100;
        if(topScore == 100) {
            System.out.println("You got the highest score!");
        }
        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second  top secore and less than 100");
        }
        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either ot both of the conditions are true");
        }
        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is true");
        }
        boolean isCar = false;
        if(isCar = true) {
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("wasCar is ture");
        }
        //You can search "Summary of operators java" on oracle website
        //you can search "java operator precedence table"

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false; //ternary operator
        System.out.println("isRemainder = " + isNoRemainder);
        if(!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
