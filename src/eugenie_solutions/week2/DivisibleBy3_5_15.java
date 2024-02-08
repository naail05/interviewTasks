package eugenie_solutions.week2;

import java.util.Scanner;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {

        String divisibelBy15 = "";
        String divisibelBy5 = "";
        String divisibelBy3 = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number between 1 ~ N");
        int number = scan.nextInt();
        while (number <= 0) {
            System.out.println("Invalid number. Please re-enter");
            number = scan.nextInt();
        }

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                divisibelBy15 += " " + i;
            }
            if (i % 3 == 0 && i % 15 != 0) {
                divisibelBy3 += " " + i;
            }
            if (i % 5 == 0 && i % 15 != 0) {
                divisibelBy5 += " " + i;
            }
        }
        System.out.println("DivisibelBy 15:" + divisibelBy15);
        System.out.println("DivisibelBy 5:" + divisibelBy5);
        System.out.println("DivisibelBy 3:" + divisibelBy3);

        System.out.println("______________________________________");

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
