/*
A parameter is a value passed into a method by its caller.

This concept of passing information to a method is called a parameter, which is
just a variable that is declared in your method, but whose value you set at
the call of that method.

Parameter: Method Declaration
    Tell the method to expect parameters, as followed:

public static voide name (type name, type name) {
    statement(s);
}

Once you're inside that method, your parameters function just like variables.
The scope exists only within the method, and you can have multiple variables of any type

Example
    public static void main(String[] args) {
        BMI(225, 76);   # Method name is BMI
    }
        public static void BMI (double weight, int height) {
         System.out.println("your BMI = " + weight / Math.pow(height,2));
        }


Making the Method Call:
    When you want to call that method, you need to tell the method what values to use.

    methodName( value, value);  # ORDER MATTERS!

Value and Reference Semantics:

Value semantics: primitive variable values are copied.
    - Modifying the parameter will not affect the original variable.

Common Errors: Forgetting to actually pass values at the call method (inside main),
        using the incorrect data type, or the wrong order of parameters.


 */

public class LearnParameters {
    public static void main(String[] args) {
        power(6);
    }
    public static void power(int exp) {
        result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= 2;
            return result;
        }
        System.out.println("base to the  " + exp + " = " + result);
    }

}
