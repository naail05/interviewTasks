package week2;

public class SwapNumbers {
        public static void main(String[] args) {
            int a = 5;
            int b = 10;

            a = a + b; // a now contains the sum of the original values
            b = a - b; // b now contains the original value of a
            a = a - b; // a now contains the original value of b

            System.out.println("a = " + a); // Output: a = 10
            System.out.println("b = " + b); // Output: b = 5
        }
    }




/*
Swap two variables values without using a third variable
 */