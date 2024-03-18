package eugenie_solutions.week4;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AAABBBCCC";
        System.out.println(removeDup(str));
        System.out.println(removeDup2(str));
    }
    /**
     * removes the duplicated letters from the given String
     * @param str
     * @return
     */
    public static String removeDup(String str) {
        if (str == null && str.isEmpty()){
            System.out.println("We have nothing to remove!");
        }
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }

        return result;
    }
    /**
     * removes the duplicated letters from the given String
     * @param str
     * @return
     */
    public static String removeDup2(String str) {
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString(); //removed the duplicates. Insertion order -same
        str = str.replace(", " ,  "" ).replace("[","").replace("]","");
        return  str;
    }


}
/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */