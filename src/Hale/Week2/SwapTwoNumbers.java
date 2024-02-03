package Hale.Week2;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int first = input.nextInt();

        System.out.println("Please enter second number: ");
        int second = input.nextInt();

        input.close();

        System.out.println("Before swapping: first = " + first + ", second = " + second);

        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("After swapping: first = " + first + ", second = " + second);




    }
}
/*
Swap numbers:

Swap two variables values without using third variable

 */
