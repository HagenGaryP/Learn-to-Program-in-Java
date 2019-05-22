

public class MathClassDemo {
    public static void main(String[] args) {
        // pythagorean theorem c = square root of (a^2 + b^2)
        int a = 5;
        int b = 10;
            // to find squared values, use the math.pow method (only returns doubles)
        double aSq = Math.pow(a, 2);
        double bSq = Math.pow(b, 2);
        double c = Math.sqrt(aSq + bSq);
        System.out.println("c = " + c);

        System.out.println("\nUsing Math method headers: ");
        //The java.lang.Math.ceil() (ceil is short for ceiling) returns the double value
        // that is greater than or equal to the argument and is equal to the nearest
        // mathematical integer. Note: If the arg is Integer, then result is an Int.
        System.out.println(Math.ceil(2.1)); // returns 3.0

        // Math.min() returns the smaller of 2 parameters
        System.out.println(Math.min(3.0, 2.0)); // returns 2.0

        // Math.max() returns the larger of 2 parameters
        System.out.println(Math.max(3.0, 1.0)); // returns 3.0

        // Math.abs() returns absolute value
        System.out.println(Math.abs(-3.0));  // returns 3.0

        // The java.lang.Math.floor() returns the double value that is less than
        // or equal to the argument and is equal to the nearest mathematical integer.
        System.out.println(Math.floor(3.99));  // returns 3.0

        System.out.println("\nUsing Math.Random(): ");

        // double random()
        // For example:    double x = Math.random();
        //          returns a randomly generated number between 0 and 1

        System.out.println(Math.random()+10); // this returns 10 + that random number.

        System.out.println(Math.random()*10); // returns 10 times that random number.

    }
}
