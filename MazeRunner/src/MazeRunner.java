import java.util.*;


public class MazeRunner {
    static Scanner input = new Scanner(System.in);
    static Maze myMap = new Maze();


    public static void main(String[] args) {
        intro();
        int moveCount = 0;
        while(!myMap.didIWin()) {
            userMove();
            moveCount++;
            movesMessage(moveCount);

            if (moveCount == 100) {
                System.out.println("Sorry, but you didn't escape in time- you lose!");
                break;
            }
        }
        if (moveCount < 100) {
            System.out.println("Congratulations, you made it out alive!");
            System.out.printf("and you did it in " + moveCount + " moves");
        }
    }

    public static void intro() {

        System.out.println("Welcome to Maze Runner! ");
        System.out.println("Here is your current position: ");
        myMap.printMap();
    }

    public static void userMove() {
        System.out.print("Where would you like to move? (R, L, U, D) ");

        String move = input.next().toUpperCase();

        while (!move.equals("R") && !move.equals("L") && !move.equals("U") && !move.equals("D")) {
            System.out.println("Where would you like to move? (R, L, U, D) ");
            move = input.next().toUpperCase();
        }

        boolean wall = true;

        if (move.equals("R")) {
            if (myMap.canIMoveRight()){
                myMap.moveRight();
                wall = false;
            } else if (myMap.isThereAPit(move)){
                navigatePit(move);
                wall = false;
            }
        } else if (move.equals("L")) {
            if (myMap.canIMoveLeft()){
                myMap.moveLeft();
                wall = false;
            } else if (myMap.isThereAPit(move)){
                navigatePit(move);
                wall = false;
            }
        } else if (move.equals("U")) {
            if (myMap.canIMoveUp()){
                myMap.moveUp();
                wall = false;
            } else if (myMap.isThereAPit(move)){
                navigatePit(move);
                wall = false;
            }
        } else if (move.equals("D")) {
            if (myMap.canIMoveDown()){
                myMap.moveDown();
                wall = false;
            } else if (myMap.isThereAPit(move)){
                navigatePit(move);
                wall = false;
            }
        }
        myMap.printMap();
        if (wall) {
            System.out.println("Sorry, you’ve hit a wall.");
            userMove();
        }
    }

    // Part 2 - Move Limit

    public static int movesMessage(int moves) {

        if (moves == 50){
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
        }
        if (moves == 75){
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        }
        if (moves == 90){
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        }
        if (moves == 100){
            System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
        }
        return moves;
    }

    // Part 3 - Watch out for pits

    private static void navigatePit(String dir) {
        if (myMap.isThereAPit(dir)){
            myMap.printMap();
            System.out.print("Watch out! There's a pit ahead, jump it? (Y, N) ");
            String jump = input.next().toUpperCase();
            if (jump.startsWith("Y")){
                try {
                    myMap.jumpOverPit(dir);
                } catch(IllegalArgumentException ex) {
                    System.out.println("\nOh No! You hit a wall on the other side and fell in the pit!\n");
                    String skull = "\u2620 ";
                    String skulls = skull.repeat(25);

                    int i;
                    for (i=0; i<5; i++) {
                        System.out.println(skulls);
                    }
                    System.exit(0);
                }
            } else {
                userMove();

            }
        }
    }



}
