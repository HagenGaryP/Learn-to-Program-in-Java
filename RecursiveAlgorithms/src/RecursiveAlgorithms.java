/*
Recursion: an algorithm that is made up of small versions of itself.
    - Solve a big problem by solving smaller versions of same problem

Recursive Programming: Methods that call themselves to solve problems recursively.
    - Powerful substitution for iteration
 */

public class RecursiveAlgorithms {
    public static void main(String[] args) {
        System.out.println("result = " + factorial(3));
        //print(2);
        print(4);

    }
    public static int factorial(int n) {
        if (n == 1) { return 1; }
        return n * factorial(n-1);
    }
    public static void print(int n) {
        if (n == 1) {
            System.out.print("< bc >");
        } else {
            System.out.print("p(" + n + ") -> ");
            print(n-1);
        }

    }
}

/*
Best to think of recursive programming in two separate pieces:

Base case:  A simple occurrence that can be answered directly, the smallest
                piece of the problem.  (way to end the recursion)

recursive case:  A more complex occurrence of the problem that cannot be
                    directly answered, but can instead be described in terms
                    of smaller occurrences of the same problem.

Make a pattern that moves values from recursive case to base case.

The key is that the recursive call must always have different parameter values than
    what it was given.  Those parameter values should be striving to move whatever
    the value was, closer to the eventual base case.

Be sure to structure your recursive methods with a base case so that it can end.
As well as with a recursive case that calls with different parameters moving towards
    the base case.

Otherwise you can end up with a stack overflow, which is an infinite loop.

 */