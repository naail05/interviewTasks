package week4;

public class StringFrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD")); // Output: A3B2C1D2
    }

public static String frequencyOfChars(String str) {

    String expectedResult = ""; //initializes an empty string expectedResult to store the final result.
    int j = 0;//This initializes an integer j to 0 and starts a while loop that iterates as long as j
    // is less than the length of the input string str
    while (j < str.length()) {
        int count = 0;//This initializes an integer count to 0 and starts a for loop that iterates over
        // each character of the input string str.
        for (int i = 0; i < str.length(); i++) {//Inside the for loop, it checks if the character at index i is equal to the character at index j in the input string str.
            // If they are equal, it increments the count.
            if (str.charAt(i) == str.charAt(j)) {
                count++;
            }
        }
        expectedResult += str.charAt(j) + "" + count;//the character at index j and the count to the expectedResult string. The + ""
        // + is used to concatenate the character and the count as strings.
        str = str.replace("" + str.charAt(j), "");
       // After processing all occurrences of the character at index j,
        // it removes all occurrences of that character from the input string str.
        // This is done to ensure that each character is processed only once.
    }
    return expectedResult;

}}
//A3B2C1D2