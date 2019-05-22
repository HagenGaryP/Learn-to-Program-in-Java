
import java.util.*;

public class ifElseStatements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What was your overall grade percentage? ");
        int grade = input.nextInt();

        if (grade > 60) {
            System.out.println("Admitted!");
        } else if (grade > 40) {
            System.out.println("You have been wait listed" );
        } else {
            System.out.println("please apply again");
        }



        /*   Which of the following will be output? a, b, c, or d?
        int x = 10;
        if(x > 100) {
            System.out.println("a");
        } else if (x > 50) {
            System.out.println("b");
        } else if (x > 10) {
            System.out.println("c");
        } else {
            System.out.println("d");
        }   */

    }
}
