package mervat_solution.week5;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str= "AAABBBCCCDEF";

        String uniqueCharacters = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                uniqueCharacters += ch;

            }

        }
        System.out.println(uniqueCharacters);
    }
}
/*
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */
