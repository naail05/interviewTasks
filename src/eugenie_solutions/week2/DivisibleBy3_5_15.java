package eugenie_solutions.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {


        List<Integer> By15 = new ArrayList<>();
        List<Integer> By5 = new ArrayList<>();
        List<Integer> By3 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int number = input.nextInt();
        while (number <= 0) {
            System.out.println("Invalid number. Please re-enter");
            number = input.nextInt();
        }

        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) {
                By15.add(i);
            } else if (i % 5 == 0) {
                By5.add(i);
            } else if (i % 3 == 0) {
                By3.add(i);
            } else {
                continue;
            }
            input.close();

        }
        System.out.println("divisibleBy3 = " + By3);
        System.out.println("divisibleBy5 = " + By5);
        System.out.println("divisibleBy15 = " + By15);

        System.out.println("_________________________________");

        solution(100);
    }
    public static void solution(int n) {

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int each : arr) {
            if (each % 15 == 0 && each % 3 == 0) {
                divisibleBy15 += each + " ";
            }
            if (each % 5 == 0 && each % 15 != 0) {
                divisibleBy5 += each + " ";
            }
            if (each % 3 == 0 && each % 15 != 0) {
                divisibleBy3 += each + " ";
            }
        }
        System.out.println("Divisible By 15: " + divisibleBy15);
        System.out.println("Divisible By 5: " + divisibleBy5);
        System.out.println("Divisible By 3: " + divisibleBy3);
    }
}
