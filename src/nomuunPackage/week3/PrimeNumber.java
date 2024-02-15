package src.nomuunPackage.week3;

public class PrimeNumber {
    public static boolean primeNum (int n){
        if (n<2){ // prime # should be more than 1
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
