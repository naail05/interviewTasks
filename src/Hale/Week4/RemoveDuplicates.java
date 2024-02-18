package Hale.Week4;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }


    public static String removeDup(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)) {
                result += each;
            }

        }

        return result;
    }


}
/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */