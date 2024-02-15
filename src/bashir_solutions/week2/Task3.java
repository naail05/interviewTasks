package bashir_solutions.week2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        printConsecutive(30);
        printConsecutiveNums(30);


    }

    public static void printConsecutive(int n) {


        for (int i = 1; i <= n; i++) {
            if ((i % 2 == 0) && (i % 3 == 0) && i % 5 == 0) {
                System.out.println("Codility" + "Test" + "Coders");

            } else if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.println("Codility" + "Test");
            } else if (i % 2 == 0) {
                System.out.println(" Codility ");
            } else if (i % 3 == 0) {
                System.out.println(" Test ");
            } else if (i % 5 == 0) {
                System.out.println(" Coders ");
            } else {
                System.out.println(i);
            }

        }
    }

    public static void printConsecutiveNums(int n) {

        Map<Integer, Object> consecutiveNums = new LinkedHashMap<>();
        Object result;
        for (int i = 1; i <= n; i++) {
            if ((i % 2 == 0) && (i % 3 == 0) && i % 5 == 0) {
                result ="Codility" + "Test" + "Coders";

            } else if ((i % 2 == 0) && (i % 3 == 0)) {
                result = "Codility" + "Test";
            } else if (i % 2 == 0) {
                result = " Codility ";
            } else if (i % 3 == 0) {
               result = " Test ";
            } else if (i % 5 == 0) {
                result = " Coders ";
            } else {
                result =(i);
            }
            consecutiveNums.put(i, result);
            System.out.println(consecutiveNums.get(i));
        }


    }
}
/*

Numbers-- print consecutive numbers
write a function:
That, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one numbers: 2, 3 or 5 it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all the three numbers 2, 3 and 5, should be replaced by CodilityTestCoders.
 */