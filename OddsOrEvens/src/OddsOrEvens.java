import java.util.*;

public class OddsOrEvens {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        System.out.println("\nLet's play a game called \"Odds and Evens\" ");
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        // choice of Odds or Evens
        String choice = input.next();

        if ((choice.equals("O")) || (choice.equals("o"))) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else if ((choice.equals("E")) || (choice.equals("e"))) {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("---------------------------------------------------------------");

        // Part 2 - Play the Game
        System.out.print("How many \"fingers\" do you put out? ");
        int fingers = input.nextInt();

        Random rand = new Random();
        int computer = rand.nextInt(6);

        System.out.println("The computer plays " + computer + " \"fingers\"");
        int sum = (fingers+computer);
        System.out.println(fingers + " + " + computer + " = " + sum);
        boolean oddOrEven = sum % 2 == 0;

        // Part 3 - Who won?
        if (oddOrEven) {
            System.out.println(sum + " is ... even!");
            if ((choice.equals("E")) || (choice.equals("e"))) {
                System.out.println(name + " wins!");
            } else{
                System.out.println("The computer wins!");
            }
        } else {
            System.out.println(sum + " is ...odd!");
            if ((choice.equals("O")) || (choice.equals("o"))) {
                System.out.println("You win!");
            } else {
                System.out.println("The computer wins!");
            }
        }
        System.out.println("---------------------------------------------------------------");
    }





}
