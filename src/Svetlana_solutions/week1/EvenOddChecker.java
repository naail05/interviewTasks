package week1;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();
    }

    // Function to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

/*
public static void main(String[] args) {
        identifyEvenOdd(5);
        identifyEvenOdd(6);
    }

    // Method to identify whether a number is even or odd
   public  static void identifyEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
 */