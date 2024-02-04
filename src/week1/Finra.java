package week1;

public class Finra {

    public static void main(String[] args) {

        finra(30);
        finra1(20);

    }


    public static void finra (int n){

        for (int i = 1; i <= n ; i++) {

            if(i % 15 == 0){ // 15 % 3 and 5
                System.out.println("FINRA");
            } else if(i % 3 == 0) {
                System.out.println("FIN");

            }else if(i % 5 == 0){
                System.out.println("RA");
            }else{
                System.out.println(i);// # which not % by 3 and 5
            }

        }
    }



    public static void finra1(int n){

        for (int i = 1; i <=n ; i++) {
            String str = "";

            if(i % 3 == 0){
                str += "FIN";
            }
            if(i % 5 == 0){
                str += "RA";
            }

            System.out.println(str.isEmpty() ? i : str);

        }
    }

    /*
    FINRA:

    Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple
    of 3 print "FIN" instead of numbers and for numbers which are a multiple of 5 print "RA" instead of numbers.For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the numbers




     */



}
