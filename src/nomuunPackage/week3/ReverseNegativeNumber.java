package src.nomuunPackage.week3;

public class ReverseNegativeNumber {
    public static int reverseNegNum (int n){
        int rev = 0;

        if (n < 0){
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        return rev;
    }
}
