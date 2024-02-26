package mervat_solution.week5;

public class ReverseString {

    public static void main(String[] args) {

        String str = "ABCD";
        String result = "";
        for (int i = str.length() -1; i >= 0 ; i--) {
            result += str.charAt(i);

        }
        System.out.println(result);
    }
}
/*
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */