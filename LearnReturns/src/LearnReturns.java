/*
Returns let a method pass information back to where it was called.  It provides a way
    to send out a value as the result of a method.  Can only return 1 thing.
        - The opposite of a parameter.
        - Sent back ast the very end of the method, after all the work is done.

working with parameters requires a different method header.  For example:
    public static TYPE name(parameters) {
        //statements
        return data;    # TELL THE METHOD WHAT TO RETURN
    }

Capture the value at the method call:
variable = name(parameter);

Common Errors:
    no return - not including the return statement in code.
    void return type - can't return with void method header.
    dropping the return value - This means that once you've actually gone through
            and properly declared that you'll return something, and then actually
            returned it up in the main method, you're not doing anything with it.
 */

public class LearnReturns {
    public static void main(String[] args) {
        System.out.println(myMethod(3));
    }
    public static boolean myMethod(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
