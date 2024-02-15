package bashir_solutions.week2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {


        List<Integer> DivisibleBy15 = new ArrayList<>();
        List<Integer> DivisibleBy5 = new ArrayList<>();
        List<Integer> DivisibleBy3 = new ArrayList<>();

        for (int j = 1; j <= 100; j++) {
            if (j % 15 == 0) {
                DivisibleBy15.add(j);
            } else if (j % 5 == 0) {
                DivisibleBy5.add(j);
            } else if (j % 3 == 0) {
                DivisibleBy3.add(j);
            } else {
                continue;

            }

        }
        System.out.println("DivisibleBy15 = " + DivisibleBy15);
        System.out.println("DivisibleBy5 = " + DivisibleBy5);
        System.out.println("DivisibleBy3 = " + DivisibleBy3);


        System.out.println("-----------------------------------------");

        Set<Integer> divisibleBy15 = new LinkedHashSet<>();
        Set<Integer> divisibleBy5 = new LinkedHashSet<>();
        Set<Integer> divisibleBy3 = new LinkedHashSet<>();

        for (int i = 1; i <= 100; i++) {
            int result = (i % 15 == 0) ? 1 : (i % 5 == 0) ? 2 : (i % 3 == 0) ? 3 : 0;

            switch (result) {
                case 1:
                    divisibleBy15.add(i);
                    break;
                case 2:
                    divisibleBy5.add(i);
                    break;
                case 3:
                    divisibleBy3.add(i);
                    break;
                default:
                    break;
            }

        }

        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy3 = " + divisibleBy3);


        System.out.println("-----------------------------------");
        divisibleBy3_5_15(30);


        System.out.println("---------------using Scanner------------");

        List<Integer> By15 = new ArrayList<>();
        List<Integer> By5 = new ArrayList<>();
        List<Integer> By3 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive Integer ");
        int n = input.nextInt();

        for (int j = 1; j <= n; j++) {
            if (j % 15 == 0) {
                By15.add(j);
            } else if (j % 5 == 0) {
                By5.add(j);
            } else if (j % 3 == 0) {
                By3.add(j);
            } else {
                continue;

            }
            input.close();

        }
        System.out.println("By3 = " + By3);
        System.out.println("By5 = " + By5);
        System.out.println("By15 = " + By15);


    }

    public static void divisibleBy3_5_15(int n) {

        List<Integer> DivisibleBy15 = new ArrayList<>();
        List<Integer> DivisibleBy5 = new ArrayList<>();
        List<Integer> DivisibleBy3 = new ArrayList<>();

        for (int j = 1; j <= n; j++) {
            if (j % 15 == 0) {
                DivisibleBy15.add(j);
            } else if (j % 5 == 0) {
                DivisibleBy5.add(j);
            } else if (j % 3 == 0) {
                DivisibleBy3.add(j);
            } else {
                continue;

            }

        }
        System.out.println("DivisibleBy15 = " + DivisibleBy15);
        System.out.println("DivisibleBy5 = " + DivisibleBy5);
        System.out.println("DivisibleBy3 = " + DivisibleBy3);

    }
    
}

/**
 * Numbers divisible by 3, 5 and 15:
 * Write a program that can print the numbers between 1~ 100 that can be divisible by 3, 5 and 15.
 * if the numbers can be divisible by 3, 5 and 15 then it should only be displayed in DivisibleBy15 section
 * if the numbers can be divisible by 3, but can not be divisible by 15 then it should only be displayed in DivisibleBy3 section
 * if the numbers can be divisible by 5, but can not be divisible by 15 then it should only be displayed in DivisibleBy5 section
 * <p>
 * ex:
 * output:
 * Divisible by 15 15 30 45 60 75 90
 * Divisible by 5 5 10 20 25 35 40 50 55 65 70 80 100
 * Divisible by 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */
