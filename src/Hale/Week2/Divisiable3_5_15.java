package Hale.Week2;

import java.util.Scanner;

public class Divisiable3_5_15 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("Please enter a number");
        int n = input.nextInt();

        String by3 = " ";
        String by5 = " ";
        String by15 = " ";

        input.close();

        for (int i = 1; i<= n; i++){

            if(i % 15 == 0){
                by15 += i + " ";
            }else if(i % 5 == 0){
                by5 += i + " ";
            }else if(i % 3 == 0){
                by3 += i + " ";
            }


        }

        System.out.println("Divisible by 15: " + by15);
        System.out.println("Divisible by 5: " + by5);
        System.out.println("Divisible by 3: " + by3);

    }
}
/**
 Numbers divisible by 3, 5 and 15:
 Write a program that can print the numbers between 1~ 100 that can be divisible by 3, 5 and 15.
 * if the numbers can be divisible by 3, 5 and 15 then it should only be displayed in DivisibleBy15 section
 *  if the numbers can be divisible by 3, but can not be divisible by 15 then it should only be displayed in DivisibleBy3 section
 *   if the numbers can be divisible by 5, but can not be divisible by 15 then it should only be displayed in DivisibleBy5 section

 ex:
 output:
 Divisible by 15 15 30 45 60 75 90
 Divisible by 5 5 10 20 25 35 40 50 55 65 70 80 100
 Divisible by 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */