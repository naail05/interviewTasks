package week1;

public class DevidingwithoutDevideOperator {

    public static void main(String[] args) {

        int dividend = 20;
        int divisor = 4;

        int result = divide(dividend, divisor);//is calling the divide method and storing its result in the variable result.

        System.out.println("Result: " + result);
    }

    public static int divide(int dividend, int divisor) {

        // Check for divide by zero
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        // Initialize quotient
        int quotient = 0;

        // Perform division
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        // Check for overflow and return the result
        return quotient;
    }}