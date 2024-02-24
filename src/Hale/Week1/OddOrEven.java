package Hale.Week1;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = input.nextInt();

        String result = "";

        input.close();

        if(num %2 == 0){
            result = "Even";
        }else {
            result = "Odd";
        }
        System.out.println(result);


    }



}
/*

write a method which can identify aa given number if it even or odd
Ex:
    identify(5) -> "Odd"
    identify(6) -> "Even"
 */