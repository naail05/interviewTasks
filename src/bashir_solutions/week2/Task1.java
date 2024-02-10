package bashir_solutions.week2;

public class Task1 {

        public static void main(String[] args) {
            int a = -250;
            int b = -100;

            // Swapping without a third variable
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }


/*
Swap numbers:

Swap two variables values without using third variable

 */