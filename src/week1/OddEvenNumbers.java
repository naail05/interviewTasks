package week1;

public class OddEvenNumbers {

    public static void main(String[] args) {
        OddEven(20);
        OddEven(49);
        OddEven(282);
        OddEven(761);

    }

    public static void OddEven( int n){

        if(n % 2 == 0){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
    }
}
