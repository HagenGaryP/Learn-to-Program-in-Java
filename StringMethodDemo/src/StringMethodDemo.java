

public class StringMethodDemo {
    public static void main(String[] args) {
        String original = "abcde";

        for (int i = 0; i < original.length(); i++) {
            System.out.println("The character at index " + i + " is " + original.charAt(i));

        }

        System.out.println("\nThe letter 'a' is at index " + original.indexOf('a'));
        System.out.println("The letter 'e' is at index " + original.indexOf('e'));

        // java returns index of -1 when it doesn't find what it was told to look for
        System.out.println("\nThe letter 'A' is at index " + original.indexOf('A'));

        original = original.toUpperCase();
        System.out.println("\nChanged string to: " + original);
        System.out.println("\nThe letter 'A' is at index " + original.indexOf('A'));

        String s = "hello world";
        System.out.println(s.length()); // length of string 's', including spaces

        char result = s.charAt(5);
        System.out.println(result); // print's the char at index 5, which is a space.

    }
}
