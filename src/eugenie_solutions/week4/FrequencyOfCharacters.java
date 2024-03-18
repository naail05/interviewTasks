package eugenie_solutions.week4;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        System.out.println(frequencyOfChars1("AAABBCDD"));
        System.out.println(frequencyOfChars2("AAABBCDD"));
        System.out.println(frequencyOfChars4("AAABBCDD"));
//        System.out.println(frequencyOfChars3("AAABBCDD"));
    }
    /**
     * finds and prints out the frequency of characters in the given str
     * @param str
     * @return
     */
    public static String frequencyOfChars1(String str) {
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }

    /**
     * finds and prints out the frequency of characters in the given str
     * @param str
     * @return
     */
    public static String frequencyOfChars2(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }
        String expectedResult = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j)) {
                    count++;
                }
            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }
        return expectedResult;
    }

    /**
     * finds and prints out the frequency of characters in the given str
     * @param str
     * @return
     */
    public static String frequencyOfChars4(String str) {
        String nonDup = "", result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }
        for (int i = 0; i < nonDup.length(); i++) {
            int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));
            result += "" + nonDup.charAt(i) + num;
        }

        return result;
    }

    /**
     * finds and prints out the frequency of characters in the given str
     * @param str
     * @return
     */
    public static String frequencyOfChars3(String str) {
        String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        b = b.replace(", ", "").replace("[", "").replace("]", "");
        String result = "";
        for (int j = 0; j < b.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals("" + str.charAt(j))) {
                    count++;
                }
            }
            result += b.substring(j, j + 1) + count;
        }
        return result;
    }

    /*
    Write a return method that can find the frequency of characters
      Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
}
