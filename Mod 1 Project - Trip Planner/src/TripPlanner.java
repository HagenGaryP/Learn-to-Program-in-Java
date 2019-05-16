/*
For this project, you are going to write a program that asks the user for some
information about an international trip they are taking. Based on that information
you will need to do some conversions, using the correct data types, to tell them
some information to help them plan their trip.
 */
import java.util.Scanner;
public class TripPlanner {
    public static void main(String[] args) {
        greeting();
        budget();
        timeDifference();
        countryArea();

    }

        // Part 1 - Greeting

    public static void greeting() {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome!  What is your name? ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        System.out.print("Where would you like to travel? ");
        String destination = input.nextLine();
        System.out.println("Great! " + destination + " sounds like a great trip");
        System.out.println("************\n");

    }

        // Part 2 - Travel time and Budget

    public static void budget() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend? ");
        double money = input.nextInt();
        System.out.print("What is the currency symbol for your destination? (i.e., USD, EU, etc... ");
        String symbol = input.next();
        System.out.print("How many " + symbol + " are there in 1 USD? ");
        double convert = input.nextDouble();
        System.out.println("\nIf you are travelling for " + days + " days, that is the same as " +
                days*24 + " hours or " + (days*24)*60 + " minutes");

        // Rounding USD per day to two decimal places
        double usdMultiply = (int)((money/days)*100);
        double usdPerDay = usdMultiply / 100;

        System.out.println("If you are going to spend $" + (int)money + " USD that means per day you can " +
                "spend up to $" + usdPerDay + " USD");

        // Rounding amount of user-specified currency to two decimal places
        double currencyRound = (int)((money*convert)*100);
        double currency = currencyRound / 100;

        // Rounding user-specified currency per day to two decimal places
        double currencyPerDayRound = (int)(((money*convert)/days)*100);
        double currencyPerDay = currencyPerDayRound / 100;

        System.out.println("Your total budget in MXC is " + currency + " " + symbol +
                ", which per day is " + currencyPerDay + " " + symbol); // need to round here

        System.out.println("************\n");
    }

        // Part 3 - Time Difference

    public static void timeDifference() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int difference = input.nextInt();
        int destTime = (difference+12)%24;
        System.out.println("That means that when it is midnight at home it will be " +
                difference + ":00 in your travel destination,\nand when it's noon at home " +
                "it will be " + destTime +":00");

        System.out.println("************\n");
    }

        // Part 4 - Country Area

    public static void countryArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km^2? ");
        double kmSquared = input.nextDouble();
        // Rounding the converted area
        double miles = (int)((kmSquared/2.59000259)*100);
        double squareMiles = miles/ 100.0;

        System.out.println("In Square Miles that is " + squareMiles);

        System.out.println("************\n");
    }

}
