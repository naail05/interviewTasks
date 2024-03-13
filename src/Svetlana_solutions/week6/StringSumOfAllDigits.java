package week6;

public class StringSumOfAllDigits {
    public static int sumOfDigits(String str) {
        int sum = 0;//his variable will be used to store the sum of the digits in the string.

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);//Inside the loop, this line gets the character at the current index i in the string
            // str and assigns it to the variable c. This allows us to examine each character in the string one by one.
            if (Character.isDigit(c)) {//his line checks if the character c is a digit using the Character.isDigit() method.
                // If the character is a digit,
                // the condition is true, and the following block of code is executed.
                sum += Character.getNumericValue(c);//If the character c is a digit, this line adds the numeric
                // value of the digit to the sum variable.
            }
        }
        return sum;//this line returns the value of the sum variable,
        // which contains the sum of all the digits in the string str.
    }

    public static void main(String[] args) {
        String str = "12 java 5 apple 3";
        int sum = sumOfDigits(str);
        System.out.println("Sum of digits in the string: " + sum);
    }
}
/*
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */