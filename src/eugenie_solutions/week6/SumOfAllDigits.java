package eugenie_solutions.week6;

public class SumOfAllDigits {
    public static void main(String[] args) {

        String str1 = "12 java 5 apple 3";

        System.out.println("The given string is: " + str1);
        System.out.println("The sum of the digits in the string is: " + sumOfDigits(str1));
    }

    /**
     * return the sum of the digits in a String
     * @param s
     * @return
     */
    public static int sumOfDigits(String s) {
        int sum = 0;
        String[] numbers = s.replaceAll("[\\D]+", " ").split(" ");
        for (String each : numbers) {
            sum += Integer.parseInt(each);
        }
        return sum;
    }
}
/*
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */