package src.nomuunPackage.week5;

public class UniqueString {
    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (result.indexOf(each) < 0){
                result += each;
            }


        }
        System.out.println(result + "");
    }

}
/*
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */