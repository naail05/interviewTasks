package Hale.Week4;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bca";
        boolean result = areBuiltOutOfSameLetters(str1, str2);
        System.out.println("Is string built out of the same letters? " + result + " " + str2 + " " + str1);
    }

    public static boolean areBuiltOutOfSameLetters(String str1, String str2) {
        // If lengths are different, they can't be built out of the same letters
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Convert back to strings to compare
        String sortedStr1 = new String(charArray1);
        String sortedStr2 = new String(charArray2);

        // Return the comparison result
        return sortedStr1.equals(sortedStr2);
    }
}
/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */