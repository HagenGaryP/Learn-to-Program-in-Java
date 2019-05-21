/*
while loop - A type of loop that executes the statements "while" its test remains true,
             an indefinite number of times.
while loop Syntax:

while (boolean test is true) {
    statements
    test update
}
For example:

String playAgain = "yes";
while (playAgain.equals("yes")) {
    playGame();
    playAgain = input.next();
}


for loop - A type of loop that includes a variable to specifically count how many times
           the code is repeated, a deterministic number of times.
Syntax:

for (initialization; test; update) {
    statements
}

Example:

for (int i = 1; i <= 10; i++) {
    System.out.println("i = " + i);
}

 */
import java.util.Scanner;

public class LoopBasics {
    public static void main(String[] args) {
        // for loop counting from zero to 10
        /*
        for (int i = 0; i <= 10; i++) {
            System.out.println("The current value of i: " + i);
        }

        // for loop counting backwards from 10 to zero
        for (int i = 10; i >= 0; i--) {
            System.out.println("The current value of i: " + i);
        }

        // nested for loop to create 5 rows with 10 columns
        for (int row = 0; row < 5; row++) {
            System.out.print("row " + row + ": ");
            for (int col = 0; col < 10; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // A single for loop runs a linear amount of times
        // Nested for loops run a quadratic number of times.


        // Using the outer loop variable within the inner for loop
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {   // This inner for loop starts from j = 0 each time it starts
                System.out.print("*");      // and executes (prints) this for each time j < i
            }                               //  and i is being incremented by 1 each time inner loop runs
            System.out.println();
        }

        // This nested for loop prints out 50 asterisks, since the inner repeats for a total of 5 times
        //  and the outer loop will repeat for a total of 10 times, resulting in 5*10 System.out.print("*");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
        }

        // will run an infinite number of times since j will always be less than i
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; i++) {
            System.out.print("*");
            }
            System.out.println();
        }


        // WHILE LOOPS

        int i = 0;
        while (i < 5) {
            System.out.println("Hello");
            i++;                        // must increment inside while, otherwise infinite loop
        }

         */
        // using input in while loop
        Scanner input = new Scanner(System.in);

        System.out.println("Hello");
        String answer = input.next();
        while (answer.equals("hello")) {
            System.out.println("Hello");
            answer = input.next();          // need to give the while loop answer to evaluate again
        }





    }

}
