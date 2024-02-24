package week3;

public class PrimeNumbers {

    public static void main(String[] args) {

        int number = 17; // Change this number to test different values
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
    /*
if (number <= 1) checks if the input number is less than or equal to 1.

return false; immediately returns false if the input number is less than or equal to 1,
as prime numbers must be greater than 1.
 */
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }
}

/*

Numbers -- PrimeNumber
Write a method that can check if a number is prime or not

A prime number is a natural number greater than 1 that cannot be formed by multiplying
 two smaller natural numbers. In other words, a prime number is a number that is only
 divisible by 1 and itself. For example, 2, 3, 5, 7, 11, and 13 are prime numbers,
 as they cannot be divided evenly by any other numbers except 1 and themselves.
 */



/* public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    scanner.close();

    if (isPrime(number)) {
        System.out.println(number + " is a prime number.");
    } else {
        System.out.println(number + " is not a prime number.");
    }
}

public static boolean isPrime(int number) {
    if (number <= 1) {
        return false;
    }
    for (int i = 2; i * i <= number; i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
}
}
*/











