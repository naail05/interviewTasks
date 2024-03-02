package src.nomuunPackage.week5;

public class ReverseString {

    public static void main(String[] args) {

        String str = "abcd";
        String result = "";

        for (int i=str.length()-1; i >= 0; i-- ){
            result = result + str.charAt(i);
        }
        System.out.println(result);

    }

}
/*
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */