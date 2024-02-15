package week3;

import java.util.Scanner;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        input = scanner.nextInt();
        System.out.print("The reversal is: ");
        reverse(input);
        System.out.println();;
    }
    public static void reverse(int number) {
        if(number < 10 && number > 0) {
            System.out.println(number);
        }
        else {
            System.out.print(number % 10);
            reverse(number/10);
        }
    }
}


