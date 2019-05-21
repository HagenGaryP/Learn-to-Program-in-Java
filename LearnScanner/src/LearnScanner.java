import java.util.Scanner;
public class LearnScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = input.next();
        System.out.println("Hello " + name);

    }
}
