package zack_solutions.week04.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class FrequencyOfChars_Zack {
    /*
    ====== String - Frequency of Characters ==================`
    Write a return method that can find the frequency of characters
            Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {
        System.out.println("frequencyOfChars_1(\"AAABBCDD\") = " + frequencyOfChars_1("AAABBCDD"));
        System.out.println("frequencyOfChars_2(\"AAABBCDD\") = " + frequencyOfChars_2("AAABBCDD"));
        System.out.println("frequencyOfChars_3(\"AAABBCDD\") = " + frequencyOfChars_3("AAABBCDD"));
        System.out.println("frequencyOfChars_4(\"AAABBCDD\") = " + frequencyOfChars_4("AAABBCDD"));
    }

    // ============= SOLUTION 1 =============================
    /**
     * finds and prints out the frequency of characters in the given str
     * @param str
     * @return
     */
    public static String frequencyOfChars_1(String str) {
        String nonDup = "";
        for(int i=0; i < str.length(); i++)
            if(!nonDup.contains(""+str.charAt(i)))
                nonDup+= ""+str.charAt(i);

        String expectedResult = "";
        for( int j=0;j < nonDup.length(); j++) {
            int count = 0;
            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) == nonDup.charAt(j))
                    count++;
            }
            expectedResult +=nonDup.charAt(j)+"" + count;
        }
        return expectedResult;
    }

    // ============= SOLUTION 2 =============================
    /**
     * finds and prints out the frequency of characters in the given str
     * @param str
     * @return
     */
    public  static  String  frequencyOfChars_2(String str) {
        String expectedResult = "";
        int j=0;
        while( j < str.length()) {
            int count = 0;
            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult +=str.charAt(j)+"" + count;
            str = str.replace(""+str.charAt(j) ,  "" );
        }
        return expectedResult;
    }


    // ============= SOLUTION 3 =============================
    /**
     * finds and prints out the frequency of characters in the given str
     * @param str
     * @return
     */
    public  static  String  frequencyOfChars_3(String str) {

        String b=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

        b = b.replace(", ","").replace("[","").replace("]","");

        String result="";

        for(int j=0; j<b.length();j++) {
            int count=0;

            for(int i=0; i<str.length(); i++) {

                if (str.substring(i, i + 1).equals("" + b.charAt(j))) {
                    count++;
                }
            }
            result+=b.substring(j, j+1)+count;
        }

        return result;

    }

    // ============= SOLUTION 4 =============================
    /**
     * finds and prints out the frequency of characters in the given str
     * @param str
     * @return
     */
    public static String frequencyOfChars_4(String str) {
        String nonDup="", result="";
        for(int i=0; i < str.length(); i++)
            if(! nonDup.contains(""+str.charAt(i)))
                nonDup += ""+str.charAt(i);

        for(int i=0; i < nonDup.length(); i++) {
            int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );
            result += ""+nonDup.charAt(i) + num;
        }

        return result;
    }



}
