package Hale.Week1;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a dividend : ");
        int dividend = input.nextInt();

        System.out.print("Please enter a divisor : ");
        int divisor = input.nextInt();

        input.close();

        divide(dividend, divisor);
    }

    private static void divide(int dividend, int divisor) {

        if (divisor == 0) {
            System.out.println("You cannot divide a number by zero.");
            return;
        }

        int count = 0;
        String result = dividend + " / " + divisor + " is ";

        while (dividend >= divisor) {
            count++;
            dividend -= divisor;

        }
        System.out.println(result + count + "\nreminder is " + dividend);


    }
}

/*

write a method that can divide two numbers without using division operator
 */