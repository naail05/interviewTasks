package week4;

public class StringSameLetters {
    public static void main(String[] args) {
        System.out.println(same("abc", "cab"));  // Output: true
        System.out.println(same("abc", "abb"));  // Output: false
    }
public static boolean same(String str1, String str2) {
    if (str1.length() != str2.length()) {//This line checks if the lengths of str1 and str2 are not equal.
        // If they are not equal, the method returns false.
        return false;
    }
    for (int i = 0; i < str1.length(); i++) {
        char currentChar = str1.charAt(i);
        if (str2.indexOf(currentChar) == -1) {//This line checks if currentChar is not found in str2 using the indexOf method.
            // If currentChar is not found, the method returns false.
            return false;
        }
    }
    return true;
}
}

/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */